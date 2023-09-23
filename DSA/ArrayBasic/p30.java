//Sum of f(a[i],a[j])

import java.util.*;
class Demo{

	static int sumOfPairs(int arr[],int m){

		int sum = 0;

		for(int i=0; i<m-1; i++){

			for(int j=i+1; j<m; j++){

				if(Math.abs(arr[j]-arr[i])>1){
					sum += arr[j] - arr[i];
				}
			}
		}
		return sum;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		int sum = sumOfPairs(arr,m);

		System.out.println(sum);
	}
}
