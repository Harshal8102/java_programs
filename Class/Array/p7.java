import java.io.*;
class Arraydemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){

			System.out.println("enter new ");

			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]);
		}
	}
}



