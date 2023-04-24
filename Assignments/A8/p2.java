
/* Program to print composite numbers between the range*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("composit numbers between " + start + " and " + end);

		for(int i=start; i<=end; i++){

			int count=0;

			for(int j=1; j<=i; j++){

				if(i % j == 0){
					count++;
				}
				if(count >= 3){
					break;
				}
			}

			if(count > 2){

				System.out.print(i + "  ");
			}
		}
	}
}

