//Missing number in array

import java.util.*;
class Demo{

	static int missingNumber(int arr[],int n){

		Arrays.sort(arr);

		int x = 1;
		for(int i=0; i<n-1; i++){
			if(x != arr[i])
				return x;
			x++;
		}

		return x;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n-1];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Missing number : " + missingNumber(arr,n));
	}
}




