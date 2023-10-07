//Second max

import java.util.*;
class Demo{

	static int secondMax(int a[],int n){

		int max1 = Integer.MIN_VALUE;
		int max2 = 0;

		for(int i=0; i<n; i++){

			if(max1 < a[i]){
				max2 = max1;
				max1 = a[i];
			}

			if(max1 > a[i] && max2 < a[i])
				max2 = a[i];
		}

		return max2;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(secondMax(arr,n));
	}
}

