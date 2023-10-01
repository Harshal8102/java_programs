//k largest element

import java.util.*;
class Demo{
	static void kLargestElement(int a[],int n,int k){

		Arrays.sort(a);

		for(int i=n-1; i>=n-k; i--)
			System.out.print(a[i] + "  ");
		System.out.println();
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter value of k");
		int k = sc.nextInt();

		kLargestElement(arr,n,k);
	}
}
