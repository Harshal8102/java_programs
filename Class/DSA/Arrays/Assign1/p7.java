
//find missing number

import java.util.*;
class Demo{

	static int findMissing(int a[],int n){

		int temp[] = new int[n+1];

		for(int i=0; i < n ; i++){
			temp[a[i]-1] = 1;
		}

		for(int i=0; i<=n; i++){
			if(temp[i] ==0)
				return i+1;
		}

		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(findMissing(arr,n));
	}
}
