/* total count of even no. */

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int count = 0;

		System.out.println("Enter array elements:");

		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0){

				count++;
			}
		}

		System.out.println("count of even numbers = " + count);
	}
}

