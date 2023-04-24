/* Program to find strong numbers from an array*/

import java.io.*;
class c2w{

	static int CheckStrongNo(int n){

		int sum=0;

		while(n != 0){

			int rem = n % 10;
			int fact=1;
			for(int j=rem; j>0; j--){

				fact = fact * j;
			}
			sum = sum + fact;
			n = n / 10;
		}

		return sum;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter elements in an array:");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){

			if(CheckStrongNo(arr[i]) == arr[i]){

				System.out.println("Strong no. " + arr[i] + " found at index: " + i);
			}
		}
	}
}
