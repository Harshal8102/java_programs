/* Write a program, take 7 characters as an input & print only vowels from the array */

import java.util.Scanner;
class c2w{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size:");
		int size = sc.nextInt();

		char arr[] = new char[size];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.next().charAt(0);
		}

		for(int i=0; i<arr.length; i++){

			if(arr[i] == 'a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){

				System.out.print(arr[i] + "  ");
			}
		}
		System.out.println();
	}
}

