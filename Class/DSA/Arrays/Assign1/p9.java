//In sorted array find first & last occurance of element x

import java.util.*;
class Demo{

	static void findFirstLastOcc(int a[],int n,int x){

		int i=0, j = n-1;
		while(a[i] <= x){

			if(a[i] == x){
				System.out.print(i + " , ");
				break;
			}
			i++;
		}

		while(a[j] >= x){
			if(a[j] == x){
				System.out.print(j);
				break;
			}
			j--;
		}
		System.out.println();
	}		

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("Enter value of x");
		int x = sc.nextInt();

		findFirstLastOcc(arr,n,x);
	}
}
