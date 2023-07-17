import java.util.*;
import java.io.*;
class demo{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no of array element");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];

		System.out.println("Enter array elements");

		for(int i = 0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		int num = arr[0];
		int x=0;

		for(int i=0; i<n; i++){

			if(arr[i] == num){
				
			}else{
				System.out.println(num + " is missing");
				break;
			}

			num++;
		}
	}
}
