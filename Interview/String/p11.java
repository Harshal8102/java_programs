

import java.io.*;
import java.util.*;
class demo{

	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = new String[5];

		System.out.println("Enter the strings in array");
		for(int i=0; i<arr.length; i++){
			arr[i] = br.readLine();
		}

		for(int i=0; i < arr.length-1; i++){

			if(arr[i].length() > arr[i+1].length()){

				String s = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = s;

				i = -1;
			}else if(arr[i].length() == arr[i+1].length()){

				if(arr[i].charAt(0) > arr[i+1].charAt(0)){

					String st = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = st;

					i = -1;
				}
			}
		}

		System.out.println("Sorted string array ");
		for(String x : arr){
			System.out.println(x + "     ");
		}
	}
}

