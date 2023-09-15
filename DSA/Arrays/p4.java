
//product of array elements

import java.io.*;
class Demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of testcases");
		int t = Integer.parseInt(br.readLine());

		while(t-- > 0){

			System.out.println("Enter no. of elements");
			int n = Integer.parseInt(br.readLine());

			int arr[] = new int[n];

			int product = 1;
			for(int i = 0; i<n; i++){
				arr[i] = Integer.parseInt(br.readLine());
				product = product * arr[i];
			}

			System.out.println(product);
		}
			
	}
}
