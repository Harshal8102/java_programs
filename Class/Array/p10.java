/* count even & odd numbers in an array*/

import java.io.*;
class c2w{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter array elements:");
		int evencount=0, oddcount=0;

		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				evencount++;
			}else{
				oddcount++;
			}
		}

		System.out.println("count of even numbers = " + evencount );
		System.out.println("count of odd numbers = " + oddcount);
	}
}



