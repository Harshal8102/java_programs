/* Print product of odd index only */

import java.util.*;
class c2w{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int product = 1;

		System.out.println("Enter array elements:");

		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();

			if(i%2!=0){

				product = product * arr[i];
			}
		}

		System.out.println("Product of odd index = " + product);
	}
}
