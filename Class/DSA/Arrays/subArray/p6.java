
//print sum of every single subarray using prefix sum


import java.util.*;
class Demo{

	static void printSumOfSubArrays(int a[],int n){

		for(int i=1; i<n; i++){
			a[i] = a[i] + a[i-1];
		}

		int sum;

		for(int i=0; i<n; i++){

			for(int j=i; j<n; j++){
				
				if(i == 0)
					sum = a[j];
				else
					sum = a[j] - a[i-1];

				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		printSumOfSubArrays(arr,n);
	}
}
