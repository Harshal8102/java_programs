//bubble sort


import java.util.*;
class demo{

	static int[] bubbleSort(int arr[]){
		
		int n = arr.length;
		for(int i=0; i<n-1; i++){

			for(int j=0; j<n-i-1; j++){

				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[6];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);
	
		System.out.println("Sorted array");
		for(int x : arr){
			System.out.print(x + "  ");
		}
	}
}
