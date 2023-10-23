//Smallest subArray with sum greater than x

import java.util.*;
class Demo{

	static int findSubArray(int a[],int n,int x){

		int smallest = Integer.MAX_VALUE;

		/*
		for(int i=0; i<n; i++){

			int sum = 0;

			for(int j=i; j<n; j++){

				sum += a[j];

				if(sum > x){
					if(smallest > j-i+1)
					       smallest = j-i+1;
					break;
				}
			}
		}*/

		int start=0,end = 0,curr_sum=0,min_len = n+1;

		while(end < n){

			while(curr_sum <= x && end < n){
				curr_sum += a[end++];
			}

			while(curr_sum > x && start < n){
				if(min_len > end-start){
					min_len = end-start;
				}
				curr_sum -= a[start++];
			}
		}
		return min_len;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter no. x");
		int x = sc.nextInt();

		System.out.println(findSubArray(arr,n,x));

	}
}
