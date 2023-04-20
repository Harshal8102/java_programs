/* print product of even elements only */

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int product=1;

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]%2==0){

				product = product * arr[i];
			}
		}

		System.out.println("Product of even elements = " + product);
	}
}

