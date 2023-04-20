/* Search a specific element from an array & return its index */

import java.util.*;
class c2w{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter elements in an array:");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter element to search:");
		int n = sc.nextInt();

		for(int i=0; i<arr.length; i++){

			if(n == arr[i]){

				System.out.println("Element found at index = " + i);
			}
		}
	}
}

