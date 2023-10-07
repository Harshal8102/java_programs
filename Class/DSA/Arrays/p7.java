//Rotate array b times

import java.util.*;
class Demo{

	static void reverse(int A[],int start,int end){

		int temp,j=0;

		for(int i=start ; i<= (start+end)/2 ; i++){
			temp = A[i];
			A[i] = A[end-j];
			A[end-j] = temp;
			j++;
		}
	}

	static void rotateArray(int A[],int k,int n){

		int temp;
	/*	while(k-- > 0){

			for(int i=0; i<n-1; i++){

				temp = A[i];
				A[i] = A[n-1];
				A[n-1] = temp;
			}
		}*/

		k %= n;
		reverse(A,0,n-k-1);
		reverse(A,n-k,n-1);
		reverse(A,0,n-1);		
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();
		int A[] = new int[n];

		for(int i=0; i<n; i++)
			A[i] = sc.nextInt();

		System.out.println("Enter b to rotate");
		int b = sc.nextInt();

		rotateArray(A,b,n);

		for(int x : A)
			System.out.println(x + "   ");
		System.out.println();

	}
}
