/* Program to print the no. divisible by 5 from 1 to 50 & the no. is even also print the count of even numbers*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a lower limit:");
		int ll = Integer.parseInt(br.readLine());

		System.out.println("Enter upper limit:");
		int ul = Integer.parseInt(br.readLine());

		int count = 0;

		for(int i =ll; i<=ul; i++){

	        	if(i%5==0 && i%2==0){

	                	System.out.print(i + "  ");
	                        count++;
			}
		}
		System.out.println();
		System.out.println("count = " + count);
	}
}

