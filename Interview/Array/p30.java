
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
		System.out.println("Duplicates elements are:");
		for(int i=0; i<arr.length-1; i++){

			if(arr[i] == arr[i+1])
				System.out.println(arr[i]);
		}


	}
}
