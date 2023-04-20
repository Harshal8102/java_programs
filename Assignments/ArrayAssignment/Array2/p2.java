/* Find number of even & odd integers in a given array of integers*/

import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[]{1,2,5,4,6,7,8};
		int ec=0, oc=0;

		for(int i=0; i<arr.length; i++){

			if(arr[i] % 2 == 0){

				ec++;
			}else{
				oc++;
			}
		}

		System.out.println("Number of even elements = " + ec);
		System.out.println("Number of odd elements = " + oc);
	}
}



