//print only characters except special characters

import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter the array size ");

		int size = sc.nextInt();

		char arr[] = new char[size];
		
		System.out.println("Enter array elements");

		int count =0;
		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.next().charAt(0);
			if((arr[i] >= 65 && arr[i] <= 90) || (arr[i] >= 97 && arr[i] <= 122)){
				count++;
			}
		}

		char ans[] = new char[count];
		int j = 0;

		for(int i=0; i<arr.length; i++){
		
			if((arr[i] >= 65 && arr[i] <= 90) || (arr[i] >= 97 && arr[i] <= 122)){
				
				ans[j] = arr[i];
				System.out.println(ans[j]);
				j++;
			}
		}

	}
}

