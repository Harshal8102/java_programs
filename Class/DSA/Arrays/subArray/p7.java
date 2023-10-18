//print sum of every single subarray using carry forward approach

import java.util.*;
class Demo{

	static void printSumOfSubArrays(int a[],int n){

		for(int i=0; i<n; i++){

			int sum = 0;
			for(int j=i; j<n; j++){
			
				sum += a[i];
				System.out.println(sum);
			}
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

		printSumOfSubArrays(arr,n);
	}
}
