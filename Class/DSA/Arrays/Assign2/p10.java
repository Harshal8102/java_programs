//find max sum strictly increasing subarray

import java.util.*;
class Demo{

	static int findMaxSum(int a[],int n){

		int sum=0,maxSum = 0;

		for(int i=0; i<n-1; i++){

			sum += a[i];

			maxSum = (maxSum < sum) ? sum : maxSum;

			if(a[i] >= a[i+1]){
				sum = 0;
			}

			if(sum < 0)
				sum = 0;
		}

		sum += a[n-1];
		maxSum = (maxSum < sum) ? sum : maxSum;

		return maxSum;
	}
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(findMaxSum(arr,n));
	}

}
