//Binary search

import java.util.*;

class demo{

	static int searchIndex(int[] arr,int n){

		int start = 0;
		int end = arr.length-1;

	//	Arrays.sort(arr);

		while(start <= end){

			int mid = (start+end)/2;
			if(arr[mid] == n){
				return mid;
			}

			if(arr[mid] < n){

				start = mid + 1;
			}else{
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to search:");
		int n = sc.nextInt();

		System.out.println(searchIndex(arr,n));
	}
}
