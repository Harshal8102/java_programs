//selection sort
import java.util.*;

class demo{

	static int[] selectionSort(int[] arr){

		for(int i=0; i<arr.length-1; i++){

			int min = i;

			for(int j=i+1; j<arr.length; j++){

				if(arr[min] > arr[j]){
					min = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}

		return arr;
	}
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int[] sortedArray = selectionSort(arr);
		System.out.println("Sorted array");
		for(int x : sortedArray){
			System.out.print(x + "  ");
		}
	}
}
