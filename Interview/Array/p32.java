
import java.io.*;
import java.util.*;
class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array1");
		char arr1[] = new char[Integer.parseInt(br.readLine())];

		for(int i=0; i<arr1.length; i++){

			arr1[i] = br.readLine().charAt(0);
		}
		
		System.out.println("Enter size of array2");
		char arr2[] = new char[Integer.parseInt(br.readLine())];

		for(int i=0; i<arr2.length; i++){

			arr2[i] = br.readLine().charAt(0);
		}

		for(int i=0; i<arr1.length; i++){
			int x = 0;
			if(arr1[i] > arr2[i]){
				x = arr1[i] - arr2[i];
				System.out.println(arr1[i] +" - " + arr2[i] + " = " + x);
			}else{ 
				x = arr2[i] - arr1[i];
				System.out.println(arr2[i] +" - " + arr1[i] + " = " + x);
			}

			if(arr1[i] == arr2[i])
				System.out.println(arr1[i] +" - " + arr2[i] + " =  0 ");
			
		}
		

		
	}
}
