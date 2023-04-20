/* Print elements that are divisible by 5 */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements:");

		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println();

		for(int i=0; i<arr.length; i++){

			if(arr[i] % 5 == 0){

				System.out.print(arr[i] + "  ");
			}
		}
	}
}



