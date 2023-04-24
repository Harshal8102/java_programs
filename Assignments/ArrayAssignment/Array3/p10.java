/* Program to print second lowest element from an array*/

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

		int min1 = arr[0];
		int min2 = arr[1];

		for(int i=1; i<arr.length; i++){

			if(min1 > arr[i]){

				min2 = min1;
				min1 = arr[i];
			}

			if(min1 < arr[i] && min2 > arr[i]){

				min2 = arr[i];
			}
		}

		System.out.println("Second lowest element in an array:" + min2);	
	}
}

