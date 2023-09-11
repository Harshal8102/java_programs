
//Kadane's algorithm for max subarray
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[8];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		int maxsum = Integer.MIN_VALUE;
		int currsum = 0;
		for(int i=0;i<arr.length; i++){

			currsum = currsum + arr[i];
			
			if(currsum < 0){
				currsum = 0;
			}

			if( maxsum < currsum){

				maxsum = currsum;
			}
			//maxsum = Math.max(currsum,maxsum);
		}

		System.out.println("max value of subarray : " + maxsum);
	}
}
