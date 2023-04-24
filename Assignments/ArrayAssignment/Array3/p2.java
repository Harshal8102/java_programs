/* Program to print reverse each element in an array*/

import java.io.*;
class c2w{

	static int reverse(int n){

		int r = 0;
		while(n != 0){

			int rem = n % 10;
			r = r * 10 + rem;
			n = n / 10;
		}

		return r;
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

			System.out.print(reverse(arr[i]) + "  ");
		}

		System.out.println();
	}
}
