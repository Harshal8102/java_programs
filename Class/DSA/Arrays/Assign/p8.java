//In-place Prefix sum

import java.util.*;
class Demo{

	static void makePrefixSum(int a[],int n){

		for(int i=1; i<n; i++){

			a[i] = a[i-1] + a[i];
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		makePrefixSum(arr,n);

		for(int x : arr)
			System.out.print(x + "   ");
		System.out.println();
	}
}
