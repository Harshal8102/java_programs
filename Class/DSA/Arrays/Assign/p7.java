//Time to equality

import java.util.*;
class Demo{

	static int timeInS(int a[],int n){

		int max = Integer.MIN_VALUE;

		for(int i=0; i<n ; i++){
			if(max < a[i])
				max = a[i];
		}

		int time = 0;

		for(int i=0; i<n; i++){

			time += max - a[i];
		}

		return time;
	}
			
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(timeInS(arr,n));
	}
}
