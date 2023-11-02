//determine given positive integer is an automorphic number or not
//(Automorphic also known as circular number) is a number whose square ends with the same digits as the number itself

import java.io.*;
class Recurrsion{
/*
	boolean automorphic(int num){

		int temp = num * num;

		for(int i=1; i<=num; i*=10){

			if(temp % (i*10) == num)
				return true;
		}

		return false;
	}*/

	boolean isAutomorphic(int num,int i){

		if(i > num)
			return false;

		int temp = num*num;

		if(temp % (i*10) == num)
			return true;

		return  isAutomorphic(num,i*10);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isAutomorphic(num,1))
			System.out.println(num + " is automorphic number");
		else
			System.out.println(num + " is not automorphic number");
	}
}
