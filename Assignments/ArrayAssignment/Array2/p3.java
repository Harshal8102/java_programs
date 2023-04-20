/* program to find the sum of even & odd numbers in an array*/

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int evensum=0, oddsum=0;

		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] % 2 == 0){

				evensum = evensum + arr[i];
			}else{
				oddsum = oddsum + arr[i];
			}
		}

		System.out.println("Odd number sum = " + oddsum);
		System.out.println("Even number sum = " + evensum);
	}
}


