//find sum of elements of contiguous subarray having smallest minimum sum

import java.util.*;
class Demo{

	static int findMinSumSubArray(int a[],int n){

		int minSum = Integer.MAX_VALUE;
		

	/*	for(int i=0; i<n; i++){

			sum = 0;
			for(int j=i; j<n; j++){

				sum += a[j];

				if(minSum > sum)
					minSum = sum;
			}
		}*/
		int currSum = Integer.MAX_VALUE;

		for(int i=0; i<n; i++){

			if(currSum > 0)
				currSum = a[i];
			else
				currSum += a[i];

			if(minSum > currSum)
				minSum = currSum;
			
		}

		return minSum;
	}
		
	public static void main(String[] args){

		int a[] = new int[]{2,6,8,1,4};

		int n = 5;

		System.out.println(findMinSumSubArray(a,n));
	}
}
