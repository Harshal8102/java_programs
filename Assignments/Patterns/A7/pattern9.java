/* Take a number & print addition of factorials of each digit from that number
 * input = 1234 
 * output = 33 */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number :");
		int num = Integer.parseInt(br.readLine());

		int n = num;
		int sum =0;
		while(num != 0){

			int rem = num % 10;
			int mul = 1;
			for(int i=1; i<=rem; i++){
				
				mul = mul * i;
			}

			sum = sum + mul;
			num = num / 10;
		}

		System.out.println("Addition of factorials of each digit from " + n + " = " + sum);
	}
}





