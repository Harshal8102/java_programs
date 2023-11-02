//check if a given number is Duck number or not
//(Duck number is a number which doesn't start with a zero but has at least one digit as zero)

import java.io.*;
class Recurrsion{

	/*boolean isDuckNumber(int num){

		while(num > 9){

			if((num%10) == 0)
				return true;

			num /= 10;
		}
		return false;
	}*/
	boolean isDuckNumber(int num){

		if(num < 10)
			return false;

		if((num%10) == 0)
			return true;

		return isDuckNumber(num/10);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isDuckNumber(num))
			System.out.println(num + " is Duck number");
		else
			System.out.println(num + " is not Duck number");
	}
}
