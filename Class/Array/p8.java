/*sum of array elements*/

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array elements:");
		int sum = 0;
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			sum = sum + arr[i];
		}

		System.out.println("Sum of array elements = " + sum);
	}
}

