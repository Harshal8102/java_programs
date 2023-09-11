//search element in sorted 2d matrix

import java.util.*;
class demo{

	static boolean findIndex(int arr[][],int key){

		int row = arr.length-1,col = 0;

		while(row >= 0  && col<arr.length){

			if(arr[row][col] == key){

				System.out.println("key found at index : " + row + " & " + col ); 
				return true;
		
			}else if(key > arr[row][col]){

				col++;
			}else{
				row--;
			}
		}

		System.out.println("key not found");
		return false;

	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[4][4];

		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){

				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter key element to find");
		int key = sc.nextInt();

		System.out.println(findIndex(arr,key));
	}
}
