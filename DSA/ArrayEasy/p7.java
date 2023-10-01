
//check if array is sorted

import java.util.*;
class Demo{

	static int checkSorted(int arr[],int n){

		for(int i=0; i<n-1; i++){
			if(arr[i] > arr[i+1]){
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(checkSorted(arr,n));
	}
}

