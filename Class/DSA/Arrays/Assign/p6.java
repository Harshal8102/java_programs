//Range sum query

import java.util.*;
class Demo{

	static void findRangeSum(int a[],int n, int q[][]){

		for(int i=1; i<n; i++)
			a[i] = a[i-1] + a[i];

		int st,en;

		for(int i=0; i<q.length; i++){

			st = q[i][0];
			en = q[i][1];

			if(st == 0)
				System.out.println(a[en]);
			else
				System.out.println(a[en] - a[st-1]);
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("enter 2d array q elements");
		int q[][] = new int[2][2];

		for(int i=0; i<q.length; i++){
			for(int j=0; j < q[i].length ; j++)
				q[i][j] = sc.nextInt();
		}

		findRangeSum(arr,n,q);
	}
}
