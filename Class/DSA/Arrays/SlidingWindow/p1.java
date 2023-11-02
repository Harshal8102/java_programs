
import java.util.*;
class Demo{
	static int noOfSubArrayKSize(int a[],int n,int k){
/*
		int count=0;
		 
		int end = k-1;
		while(end < n){
			count++;
			end++;
		}

		return count;*/

		return n - k + 1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i=0; i<n; i++){

			a[i] = sc.nextInt();
		}

		System.out.println("Enter k");
		int k = sc.nextInt();

		System.out.println("no. of subarray of k size " + noOfSubArrayKSize(a,n,k));
	}
}
