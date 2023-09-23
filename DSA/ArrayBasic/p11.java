//Product of maximum in first array and minimum in second

import java.util.*;
class Demo{

	static int productOf(int A[],int n1,int B[],int n2){

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<n1; i++){
			if(max < A[i]){
				max = A[i];
			}
		}
		
		for(int i=0; i<n2; i++){
			if(min > B[i]){
				min = B[i];
			}
		}

		return max*min;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array1 size & elements");
		int n1 = sc.nextInt();
		int A[] = new int[n1];
		for(int i=0; i<n1; i++){

			A[i] = sc.nextInt();
		}
		
		System.out.println("Enter array2 size & elements");
		int n2 = sc.nextInt();
		int B[] = new int[n2];
		for(int i=0; i<n2; i++){

			B[i] = sc.nextInt();
		}

		System.out.println("Product of max & min " + productOf(A,n1,B,n2));
	}
}	
