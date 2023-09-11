//prefix sum for max subarray
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		int prefix[] = new int[arr.length];
		prefix[0] = arr[0];

		for(int i=1; i<prefix.length; i++){

			prefix[i] = prefix[i-1] + arr[i];      //prefix sum
		}

		int maxsum = Integer.MIN_VALUE;        // -infinity

		for(int i=0;i<arr.length;i++){

			int start = i;

			for(int j=i; j<arr.length; j++){

				int end = j;

				int currsum = start == 0 ?    prefix[end]  :  prefix[end] - prefix[start-1];

				if(maxsum < currsum){
					maxsum = currsum;
				}
				
				
			}
			
		}

		System.out.println("max sum of subarray : " + maxsum);
	}
}
