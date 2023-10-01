//find tansition point

import java.util.*;
class Demo{

	static int transitionPoint(int ar[],int n){
		
		if(ar[n-1] == 0)
			return -1;
		for(int i=0; i<n ; i++){
			if(ar[i] == 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(transitionPoint(arr,n));

	}
}

