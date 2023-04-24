
/* print armstrong number from an array */

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements:");

		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){
			int count = 0;
			int sum = 0;
			int temp1 = arr[i] , temp2 = arr[i];
			while(temp1 != 0){
				count++;
				temp1 = temp1 / 10;
			}

			while(temp2 != 0){
			       int rem = temp2 % 10;
			       int mul = 1;
		               for(int j=1; j<=count; j++){
			               mul = mul * rem;
			       }
			       temp2 = temp2 / 10;
		               sum = sum + mul;
			}

                	if(sum == arr[i]){
                               System.out.println("armstrong no. " + arr[i] + " found at index " + i );
	                }

		}
	}
}

