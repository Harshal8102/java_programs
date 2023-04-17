/* 5 4 3 2 1
 * 8 6 4 2
 * 9 6 3
 * 8 4
 * 5         */

import java.io.*;

class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of rows :");

		int row = Integer.parseInt(br.readLine());

		int n = row;

		for(int i=1; i<=row; i++){

			int x = n*i;

			for(int j=1; j<=row-i+1; j++){

				System.out.print(x + "  ");
				x-=i;
			}
			System.out.println();
			n--;
		}
	}
}

