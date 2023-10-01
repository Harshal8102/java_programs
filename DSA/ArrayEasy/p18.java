//Move all zero two the end of Array

import java.util.*;
class Demo{

	static void moveZero(int a[],int n){

		int temp ;
		int k = 0;
		for(int i=0; i<n; i++){

			if(a[i] != 0){
				temp = a[k];
				a[k] = a[i];
				a[i] = temp; 
				k++;
			}
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		moveZero(arr,n);

		for(int x : arr){
			System.out.print(x + "   ");
		}
		System.out.println();
	}
}
