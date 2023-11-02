//factorial of given number

import java.io.*;
class Recurrsion{

	int factorialOf(int num){

		if(num == 1)
			return 1;


		return num * factorialOf(--num);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.factorialOf(num));
	}
}
