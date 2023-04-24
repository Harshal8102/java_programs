/* Program to print the palindrome numbers between the range*/

import java.io.*;
class c2w{

	static int reverse(int n){
		int r =0;

		while( n != 0){
			int rem = n % 10;
			r = r * 10 + rem;
			n = n / 10;
		} 

		return r;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("palindrome numbers between " + start + " and " + end);

		for(int i = start; i<end; i++){

	        	if(reverse(i) == i){
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		
	}
}

