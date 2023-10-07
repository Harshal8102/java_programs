//Multiple range sum

import java.util.*;
class Demo{

	static int rangeSum(int A[],int n,int s,int e){

		int sum = 0;
		if(s < 0){
			return -1;
		}else if(e >= n)
			return -1;

		for(int i=s; i<= e; i++)
			sum += A[i];
		
		return sum;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();
		int A[] = new int[n];

		for(int i=0; i<n; i++)
			A[i] = sc.nextInt();

		System.out.println("Enter no. of queries");
		int q = sc.nextInt();

		for(int i=0; i<q; i++){

			System.out.println("Enter starting index");
			int s = sc.nextInt();
			System.out.println("Enter ending index");
			int e = sc.nextInt();

			System.out.println("sum between s & e is : " + rangeSum(A,n,s,e));
		}
	}
}
//TC = O(n^2)
//SC = O(1)
