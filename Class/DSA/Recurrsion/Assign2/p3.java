//print maximum digit in a given number

import java.io.*;
class Recurrsion{
	

	int maxDigits(int num){

		if(num == 0)
			return Integer.MIN_VALUE;

		int temp = maxDigits(num/10);

		return (num%10>temp) ? num%10 : temp ; 
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.maxDigits(num));
	}
}
