/* Program to print the perfect cubes between the range*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("perfect cubes between " + start + " and " + end);

		for(int i = start; i<=end; i++){

	        	if(i*i*i <= end){
				System.out.print(i*i*i + "  ");
			}
		}
		
	}
}

