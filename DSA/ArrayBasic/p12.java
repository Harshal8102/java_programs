//First & last occurances of X

import java.util.*;
class Demo{

	static String findFL(int arr[],int n,int X){

		int first = -1;
		int last = -1;

		for(int i=0; i<n; i++){
			if(arr[i] == X){
				first = i;
				break;
			}
		}
		for(int i=n-1; i>=0; i--){
			if(arr[i] == X){
				last = i;
				break;
			}
		}

		if(first == -1)
			return "-1";

		return "first occ : " + first + " , last occ : " + last;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array1 size & elements");
		int n1 = sc.nextInt();
		int A[] = new int[n1];
		for(int i=0; i<n1; i++){
			A[i] = sc.nextInt();
		}
		
		System.out.println("Enter value of X");
		int X = sc.nextInt();

		System.out.println(findFL(A,n1,X));
	}
}
