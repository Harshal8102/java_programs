//Print the sum of n natural numbers
import java.io.*;
class Recurrsion{

	/*int printSum(int n){

		return (n * (n+1))/2;
	}*/

	int printSum(int n){

		if(n == 1)
			return 1;
		
		return n + printSum(n-1);
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Recurrsion obj = new Recurrsion();

		System.out.println("Enter the value of n");
		int n = Integer.parseInt(br.readLine());

		System.out.println(obj.printSum(n));
	}
}

