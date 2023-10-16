//find no. of subarrays
import java.util.*;
class Demo{

	static int noOfSubArray(int a[],int n){

		return (n * (n+1)) / 2;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(noOfSubArray(arr,n));
	}
}
