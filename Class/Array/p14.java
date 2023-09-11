//brute force for max subarray
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){

			int start = i;

			for(int j=i; j<arr.length; j++){

				int end = j;
				int sum =0;

				for(int k=start; k<=end; k++){

					sum += arr[k];	
				}
				if(max < sum){
					max = sum;
				}
				
			}
			
		}

		System.out.println("max value of subarray : " + max);
	}
}


