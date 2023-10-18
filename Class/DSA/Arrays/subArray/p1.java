//no of subarray

import java.util.*;
class Demo{

	static int countSubArray(int a[],int n){

		int count = 0;

		/*for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				count++;
			}
		}*/

		for(int i=0; i<n; i++){
			count += i+1;
		}

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(countSubArray(arr,n));

		System.out.println("no of subArrays : " + (n * (n+1))/2);
	}
}

