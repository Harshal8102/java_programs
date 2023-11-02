//find factorial of a number

import java.io.*;
class Recurrsion{

	int printFactorial(int num){
	
		if(num == 1)
			return 1;
		
		return num * printFactorial(--num);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println(obj.printFactorial(num));
	}
}
