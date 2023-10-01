//frequencies of limited range array elements

import java.util.*;
class Demo{

	static int[] frequenciesArray(int arr[],int n){

		int ans[] = new int[n];

		for(int i=0; i<n; i++){

			if(arr[i] <= n && arr[i]>0){
				ans[arr[i]-1]++;
			}
		}

		return ans;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		int ans[] = frequenciesArray(arr,n);

		for(int x : ans)
			System.out.print(x + "   ");
		System.out.println();
	}
}

