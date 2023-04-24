/* Program to take 5 numbers as input from the user & print count of digits in those numbers*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter how many numbers do you want to enter:");
		int numbers = Integer.parseInt(br.readLine());

		System.out.println("Enter " + numbers + " numbers :");
		
		for(int i = 1; i <= numbers; i++){

			int n = Integer.parseInt(br.readLine());

			int N = n;
			int count=0;

			while(N != 0){

				count++;
				N = N / 10;
			}

			System.out.println("The digit count in " + n + " is " + count);
			System.out.println();
		}
		
	}
}

