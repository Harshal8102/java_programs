//Largest number formed from an array

import java.util.*;
class Demo{

	static long largestNumber(int a[],int n){


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(largestNumber(arr,n));
	}
}
