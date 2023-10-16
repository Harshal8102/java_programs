//find first equilibrium index in array


import java.util.*;
class Demo{

	static int findEquilibrium(int a[],int n){

		/*for(int i=0; i<n; i++){

			int lsum = 0;
			int rsum = 0;

			for(int j=0; j<i; j++){
				lsum += a[i];
			}
			for(int j=i+1; j<n; j++)
				rsum += a[i];

			if(lsum == rsum)
				return i+1;
		}*/

		int rsum=0,lsum=0;

		for(int i=0; i<n;i++)
			rsum += a[i];

		for(int i=0; i<n; i++){

			if(i >0)
				lsum += a[i-1];
			rsum -= a[i];

			if(lsum == rsum)
				return i+1;
		}

		return -1;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println(findEquilibrium(arr,n));
	}
}
