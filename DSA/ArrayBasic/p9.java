//Remove an element at specific index

import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter index ");
		int index = sc.nextInt();

		int ans[] = new int[n-1];

		for(int i=0; i<n; i++){
			if(i != index){
				System.out.print(arr[i] + "    ");
			}
		}
	}
}
		
