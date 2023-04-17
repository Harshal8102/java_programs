/* D4 C3 B2 A1
 * A1 B2 C3 D4
 * D4 C3 B2 A1
 * A1 B2 C3 D4*/

import java.lang.*;
import java.io.*;
class pattern{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows:");

		int row = Integer.parseInt(br.readLine());

		for(int i=1 ; i<=row; i++){

			char ch = 'A';
			char ch1 = (char)(64+row);
			int n=row;

			for(int j=1; j<=row; j++){

				if(i%2!=0){

					System.out.print(ch1 + "" + n + "  ");
				}else{
					System.out.print(ch + "" + j + "  ");
				}
				ch++;
				ch1--;
				n--;
			}
			System.out.println();
		}
	}
}



