//product of digits of given number

import java.io.*;
class Recurrsion{

	int productOfDigits(int num){

		if(num == 0)
			return 1;

		return num%10 * productOfDigits(num/10);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.productOfDigits(num));
	}
}
