//count occurance of a specific digit in a given number

import java.io.*;
class Recurrsion{

	int countOccurance(int num,int d){

		if(num == 0)
			return 0;

		int count = 0;

		if(num%10 == d)
			count++;

		return count + countOccurance(num/10,d);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		System.out.println("Enter the digit");
		int d = Integer.parseInt(br.readLine());

		System.out.println(obj.countOccurance(num,d));
	}
}
