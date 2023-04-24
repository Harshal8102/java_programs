/* Program to print count of digits in elements of array*/

import java.io.*;
class c2w{

	static int countDigit(int n){

		int count=0;
		while(n != 0){

			count++;
			n = n / 10;
		}

		return count;
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

			System.out.print(countDigit(arr[i]) + "  ");
		}

		System.out.println();
	}
}
