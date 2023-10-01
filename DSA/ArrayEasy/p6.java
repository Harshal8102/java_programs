//Second largest

import java.util.*;
class Demo{

	static int secondLargest(int arr[],int n){

		int max1 = arr[0];
		int max2 = 0;

		for(int i=1; i<n; i++){

			if(max1 < arr[i]){
				max2 = max1;
				max1 = arr[i];
			}

			if( max1>arr[i] && (max2<arr[i])){
				max2 = arr[i];
			}
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

		System.out.println(secondLargest(arr,n));
	}
}
