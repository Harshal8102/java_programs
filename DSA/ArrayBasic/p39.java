
//Fibonacci int the array

import java.util.*;
class Demo{

	static boolean perfectSquare(int num){

		int n =(int)Math.sqrt(num);
		if(n*n == num)
			return true;

		return false;
	}

	static int noOfFibonacci(int arr[],int n){

		int count = 0;

		for(int i=0; i<n; i++){

			if(perfectSquare(5*arr[i]*arr[i]+4) || perfectSquare(5*arr[i]*arr[i]-4)){

				count++;
			}
		}

		return count;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

   		System.out.println("No. of fibanacci no.s are : " + noOfFibonacci(arr,m));
	}
}
