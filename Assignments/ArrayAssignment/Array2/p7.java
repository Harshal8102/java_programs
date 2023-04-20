/* Find the commom elements between two array*/
import java.io.*;
class c2w{
	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size:");
		int size = Integer.parseInt(br.readLine());

		int arr1[] = new int[size];
		int arr2[] = new int[size];

		System.out.println("Enter elements of first array:");
		for(int i=0; i<arr1.length; i++){

			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter elements of second array:");
		for(int j=0; j<arr2.length; j++){

			arr2[j] = Integer.parseInt(br.readLine());
		}

		System.out.println("Common elements : ");

		for(int i=0; i<arr1.length; i++){

			for(int j=0; j<arr2.length; j++){

				if(arr1[i] == arr2[j]){

					System.out.println(arr1[i]);
				}
			}
		}
	
	}
}

