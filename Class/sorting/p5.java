//QuickSort

import java.util.*;
class demo{

	static void swap(int arr[],int i, int j){

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int arr[],int low, int high){

		int pivot = arr[high];                   //pivot is last element
		int i = low-1;

		for(int j=low; j<=high-1; j++){

			if(arr[j] < pivot){

				i++;

				//swap
				swap(arr,i,j);
			}
		}

		i++;
		swap(arr,i,high);

		return i;       //pivot index
	}

	static void quickSort(int arr[], int low, int high){

		if(low < high){

			int pvti = partition(arr,low,high);            

			quickSort(arr,low,pvti-1);
			quickSort(arr,pvti+1,high);
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		quickSort(arr,0,arr.length-1);
	
		System.out.println("Sorted array");
		for(int x : arr){
			System.out.print(x + "  ");
		}
	}
}
