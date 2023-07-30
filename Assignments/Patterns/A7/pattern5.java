/*  0
 *  1 1
 *  2 3  5
 *  8 13 21 34 */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter no. of rows:");
		int row = Integer.parseInt(br.readLine());

		int n=0,m=1;

		for(int i = 1; i<=row; i++){

			for(int j=1; j<=i; j++){

				System.out.print(n + "  ");
				
				int x = m+n;
				n=m;
				m=x;
			}
			System.out.println();
		}
	}
}




