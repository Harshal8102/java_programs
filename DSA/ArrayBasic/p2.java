//find min & max in an array

import java.io.*;
class Demo{

	static String findMinMax(int arr[],int n){

		int min = arr[0];
		int max = arr[0];

		for(int i=1; i<n; i++){

			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}

		return min + "  " + max;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println(findMinMax(arr,n));
	}
}
