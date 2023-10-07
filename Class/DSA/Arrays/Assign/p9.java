//Product array puzzle

import java.util.*;
class Demo{

	static void findProductArray(int a[],int n){

		int product = a[0];
		for(int i=1; i<n; i++){
			product *= a[i];
		}

		for(int i=0; i<n; i++){
			a[i] = product / a[i];
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

		findProductArray(arr,n);

		for(int x : arr)
			System.out.print(x + "  ");
		System.out.println();
	}
}
