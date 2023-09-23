
//Largest element in an array

import java.io.*;
class Demo{

	static int largestElement(int arr[],int n){

		int largest = Integer.MIN_VALUE;

		for(int i=0; i<n; i++){

			if(arr[i] > largest){

				largest = arr[i];
			}
		}

		return largest;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(largestElement(arr,n));
	}
}
