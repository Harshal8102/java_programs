//Kth smallest element

import java.util.*;
class Demo{

	static int kSmallestEle(int a[], int n,int k){

		Arrays.sort(a);

		return a[k-1];
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

		System.out.println("kth smallest element : " + kSmallestEle(arr,n,k));
	}
}
