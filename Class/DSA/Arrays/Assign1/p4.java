//Given: positive integer array & positive integer target, return minimal length of a subarray
//whose sum is greater than or equal to target , if there is no subarray return 0 instead

import java.util.*;
class Demo{

	static int minLengthSubArray(int a[], int target, int n){

		int minLen = Integer.MAX_VALUE,sum=0;
/*
		for(int i=0; i<n; i++){

			sum = 0;

			for(int j=i; j<n; j++){

				sum += a[j];

				if(sum >= target){
					if(minLen > j-i+1)
						minLen = j-i+1;
					break;
				}
			}
		}*/
		int i=-1,j=0;

		while(i < a.length && j<=i){

			if(sum >= target){
				if(minLen > (i-j+1))
					minLen = (i-j+1);

				sum -= a[j];
				j++;
			}else{
				sum += a[++i];
			}
		}

		if(minLen < n)
			return minLen;

		return 0;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter target");
		int target = sc.nextInt();

		System.out.println(minLengthSubArray(arr,target,n));
	}
}
