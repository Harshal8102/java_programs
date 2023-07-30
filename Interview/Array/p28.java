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
		
		Arrays.sort(arr);

		System.out.println("enter the number for count");
		int x = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0; i<arr.length; i++){

			if(x == arr[i]){

				count++;
			}	
		}
		System.out.println("Occurrence count of number = " + count);
	}
}





