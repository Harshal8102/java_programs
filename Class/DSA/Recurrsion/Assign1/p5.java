//check Whether the number is prime or not
import java.io.*;
class Recurrsion{
	int i=1;
/*
	int checkPrime(int n){

		int count=0;

		for(int i=1; i<= n; i++){

			if(n % i == 0)
				count++;
		}

		return count;
	}*/

	int checkPrime(int n){

		if(i > n)
			return 0;

		int count = 0;

		if(n % i == 0)
			count++;

		i++;

		return count + checkPrime(n);
	}


	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Recurrsion obj = new Recurrsion();

		System.out.println("Enter the value of n");
		int n = Integer.parseInt(br.readLine());

		int count = obj.checkPrime(n);

		if(count == 2)
			System.out.println(n + " is prime");
		else
			System.out.println(n + " is not prime");
	}
}

