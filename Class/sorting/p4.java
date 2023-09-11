//Counting sort

import java.util.*;
class demo{

	static int[] countingSort(int[] arr){

		//finding max element in array
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length; i++){

			largest = Math.max(largest,arr[i]);
		}

		//make array of size max value & increase frequency of present element
		int count[] = new int[largest+1];
		for(int i=0; i<arr.length; i++){

			count[arr[i]]++;
		}
		
		//sorting
		int j=0;
		for(int i=0; i<count.length; i++){

			while(count[i] > 0){
				
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
		return arr;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[7];
		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int[] sortedArray = countingSort(arr);
		System.out.println("Sorted array");
		for(int x : sortedArray){
			System.out.print(x + "  ");
		}
	}
}
