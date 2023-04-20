/* print the elements whose addition of digits is even */

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];

		System.out.println("Enter elements of an array:");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Elements whose addition of digits is even :");
		
		for(int i=0; i<arr1.length; i++){

			int n = arr1[i];
			int sum = 0;

			while(n != 0){
				int rem = n % 10;

				sum = sum + rem;

				n = n / 10;
			}

			if(sum % 2 == 0){
				System.out.print(arr1[i] + "  ");
			}
		}
	}
}





	
