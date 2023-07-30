
import java.io.*;
import java.util.*;
class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");
		int arr[] = new int[Integer.parseInt(br.readLine())];

		for(int i=0; i<arr.length; i++){

			arr[i] = Integer.parseInt(br.readLine());
		}
		

		for(int i=0; i<arr.length-1; i++){

			if(i % 2 == 0){

				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		for(int x : arr){
			System.out.print( x + "   ");
		}
	}
}
