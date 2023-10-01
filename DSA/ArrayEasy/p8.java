
//Rotate Array

import java.util.*;
class Demo{

	static void rotateArray(int arr[],int n,int d){

		int temp;

		while(d > 0){
	                temp = arr[0];
			for(int i=0; i<n-1; i++){
			
				arr[i] = arr[i+1];
			}
			arr[n-1] = temp;
			d--;
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter the steps to move");
		int d = sc.nextInt();

		rotateArray(arr,n,d);

		for(int x : arr){
			System.out.print(x + "   ");
		}
		System.out.println();
	}
}

