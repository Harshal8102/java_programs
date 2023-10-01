//Remove duplicate elements from sorted array

import java.util.*;
class Demo{

	static int[] removeDuplicate(int a[],int n){
		
		int flag = 0,j=0;

		for(int i=0; i<n-1;i++){
			if(a[i] == a[i+1]){
				a[i] = flag;
				j++;
			}
		}

		int ans[] = new int[n-j];
		j = 0;

		for(int i=0; i<n; i++){
			if(a[i] != flag)
				ans[j++] = a[i];
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

		int ans[] = removeDuplicate(arr,n);

		for(int x : ans)
			System.out.print(x + "  ");
		System.out.println();
	}
}
