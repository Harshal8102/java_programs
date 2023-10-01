//Elements with left side smaller and right side greater

import java.util.*;
class Demo{

	static int uniqueElement(int A[],int n){

		int rightMin[] = new int[n];
		int leftMax[] = new int[n];
		leftMax[0] = A[0];
		rightMin[n-1] = A[n-1]; 

		for(int i=1; i<n; i++){
			leftMax[i] = Math.max(A[i],leftMax[i-1]); 
		}
		for(int i=n-2; i>=0; i--){
			rightMin[i] = Math.min(A[i],rightMin[i+1]);
		}

		for(int i=1; i< n-1; i++){
			if(A[i] >= leftMax[i] && A[i] <= rightMin[i]){
				return A[i];
			}
		}
		
		return -1;
	}
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(uniqueElement(arr,n));
	}
}
