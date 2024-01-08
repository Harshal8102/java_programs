//sort 0,1,2 in ascending order
//T.C = O(n)

import java.util.*;
class Demo{

	static void swap(int a[],int i,int j){

		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void Sort(int arr[]){

		/*//brute force
		int count0=0,count1=0,count2=0;

		for(int i=0; i<arr.length; i++){

			if(arr[i] == 0){
				count0++;
			}else if(arr[i] == 1){
				count1++;
			}else{
				count2++;
			}
		}

		for(int i=0; i<arr.length; i++){

			if(i < count0){
				arr[i] = 0;
			}else if(i < (count0+count1)){
				arr[i] = 1;
			}else{
				arr[i] = 2;
			}
		}*/

		int low=0,mid=0,high=arr.length-1;

		while(mid <= high){

			if(arr[mid] == 0){

				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid] == 1){

				mid++;
			}else{
				swap(arr,mid,high);
				high--;
			}
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		Sort(arr);
	
		System.out.println("Sorted array");
		for(int x : arr){
			System.out.print(x + "  ");
		}
		System.out.println();
	}

}
