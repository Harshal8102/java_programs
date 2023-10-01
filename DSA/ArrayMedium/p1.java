//Maximum Index

import java.util.*;
class Demo{

	static int maxIndex(int a[],int n){

		int max = 0;

		/*for(int i=0; i<n-1; i++){

			for(int j=n-1;j>i; j--){

				if(a[i] < a[j])
					max = Math.max(max,j-i);
			}
		}*/

		int i = 0,j = 1;
		int temp[] = new int[n];
		temp[n-1] = a[n-1];

		for(i = n-2; i>=0; i--){
			if(a[i] > temp[i+1])
				temp[i] = a[i];
			else
				temp[i] = temp[i+1];
		}
		i=0;
		
		while(i < j && j < n){

			if(a[i] < temp[j])
				max = Math.max(max,j-i);

			if(a[i] <= temp[j])
			       j++;
			else if (a[i] > temp[j])
				i++;
		}
				

		
		return max;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(maxIndex(arr,n));
	}
}
