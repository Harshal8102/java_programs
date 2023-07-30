/* take two character, if these character are equal then print them as it is but if they are unequal then print their difference */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter character 1:");
		char ch1 = br.readLine().charAt(0);
		System.out.println("Enter character 2:");
		char ch2 = br.readLine().charAt(0);

		if(ch1 == ch2){

			System.out.println(ch1 + " and " + ch2 + " are equal ");

		}else{

			int diff = ch2 - ch1;

			System.out.println("The difference between " + ch1 + " and " + ch2 + " is " + diff);
		}
	}
}

