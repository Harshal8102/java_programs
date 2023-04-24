/* Program to print second largest element from an array*/

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter elements in an array:");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		int max1 = arr[0];
		int max2 = 0;

		for(int i=1; i<arr.length; i++){

			if(max1 < arr[i]){

				max2 = max1;
				max1 = arr[i];
			}

			if(max1 > arr[i]  &&  max2 < arr[i]){

				max2 = arr[i];
			}
		}

		System.out.println("Second largest element in an array:" + max2);
	}
}
