//Zero sum subarrays

import java.util.*;
class Demo{

	static int countOfSubArrays(int a[],int n){

		int count = 0;
		for(int i=0; i<n; i++){
			int sum = 0;
			int j = i;
			while(j < n){
				sum += a[j++];
				if(sum == 0)
					count++;
			}
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

		System.out.println(countOfSubArrays(arr,n));
	}
}
