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

		System.out.println("Enter no. of rotation");
		int num = Integer.parseInt(br.readLine());

		for(int j = 0 ; j<num;j++){
		  	for(int i= 0; i<n-1 ; i++){

				int temp = arr[n-(i+1)];
		        	arr[n-(i+1)] = arr[n-(i+2)];
	       			arr[n-(i+2)] = temp;
			}		
		}
		for(int i = 0; i<n; i++){
			System.out.print(arr[i]);
		}
	}
}

