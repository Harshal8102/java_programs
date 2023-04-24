/* Program to print Armstrong numbers between the range*/

import java.io.*;
class c2w{

	static int checkArmstrong(int num,int c){
		int sum=0;
		while(num != 0){
			int rem = num % 10;
			int mul = 1;
		        for(int i=1; i<=c ; i++){
		         	mul = mul * rem;
			}
			num = num / 10;
			sum = sum + mul;
		}
		return sum;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Armstrong numbers between " + start + " and " + end);

		for(int i = start; i<=end; i++){

	        	int n = i;
			int count=0;
			while(n != 0){
				count++;
				n = n / 10;
			}

			if(checkArmstrong(i,count) == i){

				System.out.print(i + "  ");
			}

		}
		System.out.println();
	}
}

