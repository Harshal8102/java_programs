//maxSum of k size subarray

import java.util.*;
class Demo{

	static int maxSumKSizeSubArray(int a[],int n,int k){

		int maxSum = Integer.MIN_VALUE;
		int sum = 0;

		int start = 0,end = k-1;
/*		while(end < a.length){
			sum = 0;
			for(int i=start; i<=end; i++){
				sum += a[i];
			}
			if(maxSum < sum)
				maxSum = sum;

			end++;
			start++;
		}*/
		//by prefix sum
		int preSum[] = new int[n];
		preSum[0] = a[0];

		for(int i=1; i<n; i++){
			preSum[i] = a[i] + preSum[i-1];
		}

		while(end < n){

			if(start == 0)
				sum = preSum[end];
			else
				sum = preSum[end] - preSum[start-1];
			if(maxSum < sum)
				maxSum = sum;

			start++;
			end++;
		}

		return maxSum;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("Enter k");
		int k = sc.nextInt();

		System.out.println(maxSumKSizeSubArray(a,n,k));
	}
}
