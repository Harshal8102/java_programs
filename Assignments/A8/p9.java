/* Program to print the strong numbers from the entered range*/

import java.io.*;
class c2w{

	static int strongCheck(int n){

		int sum=0;

		while(n != 0){

			int rem = n % 10;
			int fact = 1;

			for(int k=rem; k>0; k--){

				fact = fact * k;
			}

			sum = sum + fact;
			n = n / 10;
		}

		return sum;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("strong numbers between " + start + " and " + end);

		for(int i = start; i<=end; i++){

	        	if(strongCheck(i) == i){

				System.out.print(i + "  ");
			}
		}

		System.out.println();
		
	}
}

