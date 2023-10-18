
//find subArray giving maxSubArray sum using kadanes Algo


import java.util.*;
class Demo{

	static void maxSubArray(int a[],int n){

		int sum = 0,maxSum = Integer.MIN_VALUE;
		int x = -1,start = 0,end = n-1;

		for(int i=0; i<n; i++){

			if(sum == 0)
				x = i;

			sum += a[i];

			if(sum > maxSum){
				maxSum = sum;
				start = x;
				end = i;
			}

			if(sum < 0)
				sum = 0;
		}

		for(int i=start; i<=end; i++){

			System.out.print(a[i] + "   ");
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

		maxSubArray(arr,n);
	}
}
