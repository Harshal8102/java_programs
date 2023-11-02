//sum of odd numbers upto given number

import java.io.*;
class Recurrsion{
	
	int i=1,sum=0;
	int sumOf(int num){

		if(i > num)
			return 0;

		sum = i;
		i = i+2;

		return sum + sumOf(num);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.sumOf(num));
	}
}
