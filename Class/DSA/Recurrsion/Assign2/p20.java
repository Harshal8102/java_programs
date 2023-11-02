//Determine given positive number is Deficient number or not.
//Deficient number is a positive integer where the sum of its proper divisors is less than the number itself.

import java.io.*;
class Recurrsion{

	/*boolean isDeficientNumber(int num){

		int sum = 1;

		for(int i=2; i<=num/2; i++){

			if(num%i == 0)
				sum += i;
		}

		return sum < num;
	}*/

	boolean isDeficientNumber(int num,int sum,int i){

		if(i > num/2)
			return sum < num;

		if(num%i == 0)
			sum += i;

		return isDeficientNumber(num,sum,i+1);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isDeficientNumber(num,1,2))
			System.out.println(num + " is deficient number");
		else
			System.out.println(num + " is not deficient");
	}
}
