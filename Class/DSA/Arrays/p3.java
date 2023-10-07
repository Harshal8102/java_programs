//reverse array

import java.util.*;
class Demo{

	static void reverseArray(int a[],int n){

		int temp;
		for(int i=0; i<n/2; i++){

			temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		reverseArray(arr,n);

		for(int x : arr)
			System.out.print(x + "  ");
		System.out.println();
	}
}
