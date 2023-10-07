//Linear Search - multiple occurances

import java.util.*;
class Demo{

	static int noOfOcc(int a[],int n, int b){

		int count = 0;

		for(int i=0; i<n/2; i++){

			if(a[i] == b)
				count++;

			if(a[n-1-i] == b)
				count++;
		}

		if(n%2!=0 && a[n/2] == b)
			count++;

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}
		System.out.println("enter value of b");
		int b = sc.nextInt();

		System.out.println("no. of occurances of b : " + noOfOcc(arr,n,b));

	}
}

