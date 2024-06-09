//sum of max & min

import java.util.*;
class Demo{

	static int sumOfMaxMin(int a[],int n){

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<n; i++){

			if(min > a[i])
				min = a[i];

			if(max < a[i])
				max = a[i];
		}

		return min + max;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("sum of max & min : " + sumOfMaxMin(arr,n));
	}
}
