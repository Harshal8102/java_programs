
//max product of two numbers

import java.util.*;
class Demo{

	static int maxProduct(int arr[],int n){

	//	int max = Integer.MIN_VALUE;

		/*for(int i=0; i<n-1; i++){

			for(int j = i+1;j<n ; j++){

				if(arr[i] * arr[j] > max){
					max = arr[i]*arr[j];
				}
			}
		}*/

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max = 0;
		for(int i=0; i<n; i++){

			if(arr[i] > max1){
				max2 = max1;
				max1 = arr[i];
			}

			if(max1>arr[i] && max2<arr[i]){
				max2 = arr[i];
			}
		}

		max = max1 * max2;

		return max;
	}
	public static void main(String[] args){

		int arr[] = {1,4,3,6,7,0};
		int n = 5;

		System.out.println("max product : " + maxProduct(arr,n));
	}
}



		
