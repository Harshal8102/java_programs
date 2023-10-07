//Multiple range sum using prefix sum without using additional array

import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();
		int A[] = new int[n];


		for(int i=0; i<n; i++){
			A[i] = sc.nextInt();
			if(i > 0)
				A[i] = A[i] + A[i-1];    //Prefix sum array
		}

		System.out.println("Enter no. of queries");
		int q = sc.nextInt();

		for(int i=0; i<q; i++){

			System.out.println("Enter starting index");
			int s = sc.nextInt();
			System.out.println("Enter ending index");
			int e = sc.nextInt();

			if(s == 0)
				System.out.println(A[e]);
			else
				System.out.println(A[e] - A[s-1]);
		}
	}
}
//TC = O(n)
//SC = O(n)
