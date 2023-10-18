//maxSum of max contiguous subarray using kadanes algorithm

import java.util.*;
class Demo{

	static int maxSum(int a[],int n){

		int sum = 0,maxSum = Integer.MIN_VALUE;

		for(int i=0; i<n; i++){

			sum += a[i];

			if(maxSum < sum)
				maxSum = sum;

			if(sum < 0)
				sum = 0;
		}

		return maxSum;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(maxSum(arr,n));
	}
}
