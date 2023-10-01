//Peak Elements

import java.util.*;
class Demo{

	static int peakElement(int arr[],int n){

		if(arr[0] > arr[1])
			return 0;
		for(int i=1; i<n-1; i++){
			if(arr[i] > arr[i+1] && arr[i] > arr[i-1])
				return i;
		}

		if(arr[n-1] > arr[n-2])
			return n-1;

		return -1;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();
		
		if(peakElement(arr,n) > -1)
			System.out.println(1);
		else
			System.out.println(0);
	}
}

