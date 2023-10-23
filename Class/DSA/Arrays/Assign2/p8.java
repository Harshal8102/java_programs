//Maximum product subArray
	
import java.util.*;
class Demo{

	static int maxProductSubArray(int a[],int n){

		int mul=1,maxProduct = Integer.MIN_VALUE;
/*
		for(int i=0; i<n; i++){
			mul = a[i];
			maxProduct = (maxProduct < mul) ? mul : maxProduct; 
			for(int j=i+1; j<n; j++){
				mul *= a[j];
				if(mul > maxProduct){
					maxProduct = mul;
				}
			}
		}*/

		for(int i=0; i<n; i++){
			mul *= a[i];

			maxProduct = (maxProduct < mul) ? mul : maxProduct;

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

		for(int i=0; i<arr.length; i++)
			arr[i] = sc.nextInt();

		System.out.println(maxProductSubArray(arr,n));
	}
}
