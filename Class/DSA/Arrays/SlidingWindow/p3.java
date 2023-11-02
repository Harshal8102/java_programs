//maxSum of k size subArray using sliding window

import java.util.*;
class Demo{

	static int maxSumKSizeSubArray(int a[],int n,int k){

		int start = 0,end = k;
		int sum = 0;
		for(int i =0; i<k;i++){
			sum += a[i];
		}

		int maxSum = sum;
	
		while(end < a.length){

			sum = sum - a[start] + a[end];

			if(sum > maxSum)
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
