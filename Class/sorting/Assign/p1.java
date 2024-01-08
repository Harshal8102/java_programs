//bubble sort

import java.util.*;
class Demo{

	static void bubbleSort(int arr[]){

		int count = 0;
		for(int i=0; i<arr.length-1; i++){

			for(int j=0; j<arr.length-1; j++){

				if(arr[j] > arr[j+1]){

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				count++;
			}
		}

		System.out.println("count = " + count);
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		bubbleSort(arr);
	
		System.out.println("Sorted array");
		for(int x : arr){
			System.out.print(x + "  ");
		}
		System.out.println();
	}
}
