//insertion sort
import java.util.*;

class demo{

	static int[] insertionSort(int[] arr){
	
		for(int i=1; i<arr.length; i++){

			int curr = arr[i];
			int prev = i-1;

			//find out correct position to insert

			while(prev >= 0 && arr[prev] > curr){

				arr[prev+1] = arr[prev];
				prev--;
			}

			//insertion at correct pos
			arr[prev+1] = curr;
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

		int[] sortedArray = insertionSort(arr);
		System.out.println("Sorted array");
		for(int x : sortedArray){
			System.out.print(x + "  ");
		}
	}
}
