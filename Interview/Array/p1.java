import java.io.*;
class demo{

	public static void main(String[] args){

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter arrys size:");
		int size=0;
		try{
			size = Integer.parseInt(br.readLine());
		}catch(IOException obj){

		}

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){
			try{
				arr[i] = Integer.parseInt(br.readLine());
			}catch(IOException obj){
			}
		}
		System.out.println("Array elements are:");
		for(int x : arr){

			System.out.println(x);
		}
	}
}

