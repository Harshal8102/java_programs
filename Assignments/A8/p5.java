/* Program to print the perfect number between the range*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("perfect number between " + start + " and " + end);

		for(int i = start; i<=end; i++){

	        	int sum = 0;

			for(int j=1; j<i; j++){

				if(i%j == 0){

					sum = sum + j;
				}
			}

			if(i == sum){
				System.out.print(i + "  ");
			}
		}
		
	}
}

