//Multiply left & right array sum


import java.util.*;
class Demo{

	static int productOfSubArray(int arr[],int m){

		int sum1 = 0;
		int sum2 = 0;

		for(int i=0; i<m; i++){

			if(i<m/2){
				sum1 += arr[i];
			}else{
				sum2 += arr[i];
			}
		}

		return sum1*sum2;
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array");
		int m = sc.nextInt();
		int arr[] = new int[m];
		for(int i=0; i<m; i++){
			arr[i] = sc.nextInt();
		}

		int x = productOfSubArray(arr,m);

		System.out.println("product of two subarrays : " + x);

	}
}
