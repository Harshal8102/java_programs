// sum of digits of given positive integer

import java.io.*;
class Recurrsion{

	int sumOfDigits(int num){

		if(num == 0)
			return 0;

		return num%10 + sumOfDigits(num/10);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.sumOfDigits(num));
	}
}
