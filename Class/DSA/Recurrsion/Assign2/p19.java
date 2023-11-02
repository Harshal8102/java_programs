//determine whether a given number is square number or not

import java.io.*;
class Recurrsion{

	/*boolean isSquareNumber(int num){

		int temp = 1;

		while(temp*temp <= num){

			if(temp*temp == num)
				return true;

			temp++;
		}

		return false;
	}*/

	boolean isSquareNumber(int num,int temp){

		if(temp*temp > num)
			return false;

		if(temp*temp == num)
			return true;

		return isSquareNumber(num,temp + 1);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isSquareNumber(num,1))
			System.out.println(num + " is square number");
		else
			System.out.println(num + " is not square number");

	}
}
