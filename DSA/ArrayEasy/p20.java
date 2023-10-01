//Bitonic point

import java.util.*;
class Demo{

	static int bitonicPoint(int a[],int n){
		//int max = Integer.MIN_VALUE;
		int st = 0,en=n-1;

		while(st <= en){

			int mid = (st+en)/2;

			if(a[mid-1] < a[mid] && a[mid] > a[mid+1])
				return a[mid];

			if(a[mid] < a[mid+1])
				st = mid+1;
			if(a[mid-1] > a[mid])
				en = mid-1;
		}


			/*max = Math.max(max,a[st]);
			max = Math.max(max,a[en]);

			st++;
			en--;*/
		

		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(bitonicPoint(arr,n));
	}
}
