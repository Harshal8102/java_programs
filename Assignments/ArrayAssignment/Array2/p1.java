/* Program to find sum of all elements in the array */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		int sum=0;

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			sum = sum + arr[i];
		}

		System.out.println("Sum of all elements in array = " + sum);
	}
}

