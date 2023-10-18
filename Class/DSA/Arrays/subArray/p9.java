
//print maxSum of contiguous subarray

import java.util.*;
class Demo{

	static int maxSum(int a[],int n){

		int maxSum = Integer.MIN_VALUE;
		/*brute force
		for(int i=0; i<n; i++){

			for(int j=i; j<n; j++){
				int sum = 0;

				for(int k=i; k<=j; k++){
					sum += a[k];
				}
				if(maxSum < sum)
					maxSum = sum;
			}
		}*/

		/*carry forward approach
		for(int i=0; i<n ; i++){
			int sum = 0;
			for(int j=i; j<n; j++){
				sum += a[j];
				if(sum > maxSum)
					maxSum = sum;
			}
		}*/

		//prefixsum approach

		for(int i=1; i<n; i++)
			a[i] = a[i] + a[i-1];

		int sum;
		for(int i=0; i<n; i++){

			for(int j=i; j<n; j++){

				if(i == 0)
					sum = a[j];
				else
					sum = a[j] - a[i-1];

				if(sum > maxSum)
					maxSum = sum;
			}
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
