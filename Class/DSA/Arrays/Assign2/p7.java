//Reverse sub array

import java.util.*;
class Demo{

	static void swap(int a[],int n,int l,int r){

		int i=0,j=n-1,flag=0;
		while(a[i] <= l){
			if(a[i] == l){
				l = i;
				break;
			}
			i++;
		}
		while(a[j] >= r){
			if(a[j] == r){
				r = j;
				break;
			}
			j--;
		}

		int temp;
		if(l < r){
			while(l < r){

				temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				l++;
				r--;
			}
		}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length ; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("enter l & r values");
		int l = sc.nextInt();
		int r = sc.nextInt();

		swap(arr,n,l,r);

		for(int x : arr)
			System.out.print(x + "  ");
		System.out.println();
	}
}



