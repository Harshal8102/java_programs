//check whether a given number is strong number or not

import java.io.*;
class Recurrsion{

	/*int strongNumber(int num){

		int sum = 0;

		while(num != 0){
			int rem = num%10;

			int mul = 1;
			for(int i=rem; i>=2; i--){
				mul *= i;
			}
			sum += mul;
			num /= 10;
		}
		return sum;
	}*/
	int factorOf(int n){
		if(n <= 2)
			return n;

		return n * factorOf(n-1);
	}

	int strongNumber(int num){

		if(num == 0)
			return 0;

		return factorOf(num%10) + strongNumber(num/10);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		int ans = obj.strongNumber(num);

		if(ans == num)
			System.out.println(num + " is strong number");
		else
			System.out.println(num + " is not strong number");
	}
}
