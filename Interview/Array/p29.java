
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
				
		for(int i=0; i<arr.length/2; i++){

			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}

		System.out.println("reverse array is:");

		for(int x :arr){

			System.out.print(x + "     ");
		}
		System.out.println();

		
	}
}
