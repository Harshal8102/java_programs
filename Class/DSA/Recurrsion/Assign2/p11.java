//check if given number is a Harshad Number or not.
//(A Harshad Number is a number that is divisible by sum of its digits)

import java.io.*;
class Recurrsion{
/*
	boolean isHarshadNumber(int num){

		int temp = num;

		int sum = 0;
		while(temp != 0){

			sum += temp%10;
			temp /= 10;
		}

		return num % sum == 0;
	}*/

	//Recurrsion
	int sumOfDigits(int n){

		if(n == 0)
			return 0;

		return n%10 + sumOfDigits(n/10);
	}

	boolean isHarshadNumber(int num){

		return num % sumOfDigits(num) == 0;
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isHarshadNumber(num))
			System.out.println(num + " is Harshad Number");
		else
			System.out.println(num + " is not Harshad Number");
	}
}
