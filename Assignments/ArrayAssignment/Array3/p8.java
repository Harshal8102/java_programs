
/* print palindrome number from an array */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements:");

		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){
			int n = arr[i];
			int reverse = 0;
			while(n != 0){
				int rem = n % 10;
				reverse = reverse * 10 + rem;
				n = n / 10;
			}

			if(reverse == arr[i]){
				System.out.println("palindrome no. " + arr[i] + " found at index " + i);
			}
		}
	}
}

