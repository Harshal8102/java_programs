//Left most and right most index

import java.util.*;
class Demo{

	static String leftRightIndex(int arr[],int n,int x){

		int st = 0,en = n-1;

		while(st<=en){

			if(arr[st] == x && arr[en] == x)
				break;

			if(arr[st] < x){

				st++;
			}
			if(arr[en] > x){
				en--;
			}
		}

		return st + " "+ en;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter value of x");
		int x = sc.nextInt();

		System.out.println(leftRightIndex(arr,n,x));
	}
}
