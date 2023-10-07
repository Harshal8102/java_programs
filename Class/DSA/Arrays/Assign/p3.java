//search insertion position


import java.util.*;
class Demo{

	static int findIndex(int a[],int n,int t){

		int i = 0,j=n-1,mid;

		while(i <= j){

			mid = (i + j)/2;

			if(a[mid] == t)
				return mid;
			if(a[mid] < t)
				i = mid+1;
			else
				j = mid-1;
		}

		return i;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.println("enter target");
		int t = sc.nextInt();

		System.out.println(findIndex(arr,n,t));
	}
}
		
