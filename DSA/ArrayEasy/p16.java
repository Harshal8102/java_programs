
//Rotation

import java.util.*;
class Demo{

	static int findK(int arr[],int n){

		int k = 0;
		if(arr[0] < arr[n-1])
			return 0;
		for(int i=0; i<n-1;i++){
		       if(arr[i] > arr[i+1]){
		       		k = i;
		       }
		}		       
		return k+1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Array rotated : " + findK(arr,n) + " times");
	}
}
