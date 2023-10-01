//Three Great Candidates

import java.util.*;
class Demo{

	static int maxCollectivity(int a[],int n){

		if(n < 3)
			return 0;
		Arrays.sort(a);

		return a[n-1] * a[n-2] * a[n-3];
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(maxCollectivity(arr,n));
	}
}
