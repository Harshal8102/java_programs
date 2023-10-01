//Facing the sum

import java.util.*;
class Demo{

	static int countBuilding(int a[],int n){

		int count = 1;
		int maxB = a[0] ;
		for(int i=1; i<n; i++){

			if(a[i] > maxB)
				count++;

			if(maxB < a[i])
				maxB = a[i];
		}

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();


		System.out.println("Count of buildings able to see sunrise : " + countBuilding(arr,n));
	}
}
