//search element in an array

import java.io.*;
class Demo{

	static int searchIndex(int arr[],int n,int x){

		for(int i=0; i<n; i++){

			if(arr[i] == x){

				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of elements");
		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];

		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("enter element to search");
		int x = Integer.parseInt(br.readLine());

		System.out.println(searchIndex(arr,n,x));
	}
}
