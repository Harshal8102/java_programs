//find product of max product subarray


import java.util.*;
class Demo{

	static int  maxProduct(int a[],int n){

		int maxProduct = Integer.MIN_VALUE;

		int mul = 1;

		for(int i=0; i<n; i++){

			mul *= a[i];

			if(maxProduct < mul)
				maxProduct = mul;

			if(mul == 0)
				mul = 1;
		}

		return maxProduct;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size & elements");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}


		System.out.println(maxProduct(arr,n));
	}
}
