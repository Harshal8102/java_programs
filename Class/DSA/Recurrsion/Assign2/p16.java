//determine whether a given number is a cube number or not
//(A cube number is defined as a number that is cube of an integer)

import java.io.*;
class Recurrsion{

	/*boolean isCubeNumber(int num){

		int temp = 1;

		while(temp*temp*temp <= num){

			if(temp*temp*temp == num)
				return true;

			temp++;
		
		}
		return false;
	}*/
	int temp = 1;

	boolean isCubeNumber(int num){

		if(temp*temp*temp > num)
			return false;

		if(temp*temp*temp == num)
			return true;

		temp++;

		return isCubeNumber(num);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isCubeNumber(num))
			System.out.println(num + " is cube number");
		else
			System.out.println(num + " is not cube number");

	}
}
