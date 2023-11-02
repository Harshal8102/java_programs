//Maximum of all subARray of size k
import java.util.*;

class Demo{

	static void findMax(int a[],int n,int k){
/*
		for(int i=0; i<=n-k; i++){

			int max = a[i];

			for(int j=i+1; j<i+k; j++){

				if(max < a[j])
					max = a[j];
			}

			System.out.print(max + "  ");
		}*/


		
		System.out.println();
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println("enter k");
		int k = sc.nextInt();

		findMax(arr,n,k);
	}
}


