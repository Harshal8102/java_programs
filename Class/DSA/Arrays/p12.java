//Equilibrium index of an array

import java.util.*;
class Demo{

	static int findEquilibrium(int a[],int n){

		/* brute force
		for(int i=0; i<n; i++){

			int lSum=0,rSum=0;

			for(int j=0; j<i; j++)
				lSum += a[j];
			for(int j=i+1; j<n ; j++)
				rSum += a[j];

			if(lSum == rSum)
				return i;
		}*/

		/*
		int lSum =0,rSum = 0;

		for(int i=0; i<n; i++){

			if(i > 0)
				lSum += a[i-1];

			for(int j=i+1; j<n; j++){
				rSum += a[j];
			}
			if(lSum == rSum)
				return i;
			rSum = 0;
		}*/

		//optimized

		int rSum = 0,lSum=0;

		for(int x : a)
			rSum += x;

		for(int i=0; i<n; i++){

			if(i > 0){
				lSum += a[i-1];
			}
			rSum -= a[i];

			if(lSum == rSum)
				return i;
		}

		return -1;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println(findEquilibrium(arr,n));
	}
}

