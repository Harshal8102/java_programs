/*All even numbers in reverse order &
 * all odd numbers in the standard way*/

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start number:");
		int st = Integer.parseInt(br.readLine());
		System.out.println("Enter last number:");
		int lt = Integer.parseInt(br.readLine());

		for(int i=lt; i>=st; i--){

			if(i%2==0){
				System.out.print(i + "  ");
			}
		}
		System.out.println();
		for(int j=st; j<=lt; j++){

			if(j%2!=0){
				System.out.print(j + "  ");
			}
		}
		System.out.println();
	}
}

