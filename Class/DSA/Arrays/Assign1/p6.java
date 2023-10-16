//Rotate array to left(counter clockwise direction) by D steps


import java.util.*;
class Demo{

	static void swap(int a[],int st,int en){

		int temp;
		int j=0;
		for(int i=st; i < (st+en)/2; i++){

			temp = a[i];
			a[i] = a[en-1-j];
			a[en-1-j] = temp;
			j++;
		}
	}

	static void rotateArray(int a[], int n,int D){

		swap(a,0,D);

		swap(a,D,n);

		swap(a,0,n);
	}
		
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value of d");
		int D = sc.nextInt();

		rotateArray(arr,n,D);
		
		for(int x : arr)
			System.out.print(x + "   ");
		System.out.println();
	}
}
