//Subarray with zero sum

import java.util.*;
class Demo{

	static String isWithZeroSum(int a[],int n){

		for(int i=0; i<n; i++){

			int sum = 0;

			for(int j=i; j<n; j++){

				sum += a[j];
				if(sum == 0){
					return "yes";
				}
			}
		}

		return "no";
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(isWithZeroSum(arr,n));
	}
}
