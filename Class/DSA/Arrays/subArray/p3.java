//print all subarray

import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++){

			for(int j=i; j<n; j++){

				for(int k=i; k<=j; k++){
					System.out.print(arr[k] + "  ");
				}
				System.out.println();
			}
		}
	}
}

