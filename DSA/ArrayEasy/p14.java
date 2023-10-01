//Intersection of two arrays

import java.util.*;
class Demo{

	static int intersectionCount(int a[],int n,int b[],int m){

		int count = 0;

		for(int i=0; i<n; i++){

			for(int j=0; j<m; j++){

				if(a[i] == b[j])
					count++;
			}
		}

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter array 2");
		int m = sc.nextInt();
		int arr2[] = new int[m]; 
		for(int i = 0; i<m; i++)
			arr2[i] = sc.nextInt();

		System.out.println(intersectionCount(arr,n,arr2,m));
	}
}

