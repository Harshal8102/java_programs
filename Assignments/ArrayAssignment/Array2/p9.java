/* Merge two given arrays*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];
		int arr2[] = new int[size];
		int n = arr1.length;
		int m = arr2.length;
		int arr3[] = new int[n+m];

		System.out.println("Enter elements of first array:");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());
			arr3[i] = arr1[i];
		}

		System.out.println("Enter elements of second array:");
		for(int j=0; j<arr2.length; j++){

			arr2[j] = Integer.parseInt(br.readLine());
			arr3[j+n] = arr2[j];
		}


		System.out.println("Merged array :");
		for(int k=0; k<arr3.length; k++){

			System.out.print(arr3[k] + "  ");
		}
	}
}


