
//print total sum of all subarrays


import java.util.*;
class Demo{

	static int printSumOfSubArrays(int a[],int n){

		int totalSum=0;
		for(int i=0; i<n; i++){

			int sum = 0;

			for(int j=i; j<n; j++){
				
				sum += a[j];
				totalSum += sum;
			}
		}
		return totalSum;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(printSumOfSubArrays(arr,n));
	}
}
