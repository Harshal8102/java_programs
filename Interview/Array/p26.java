
import java.io.*;
class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no. of rows");
		int row = Integer.parseInt(br.readLine());

		char arr[][] = new char[row][];                      //2d array initialization

		for(int i=0; i<arr.length; i++){                     //initialization of 1d array of 2d array
			
			arr[i] = new char[i+1];
		}
			
		
		for(int i=0; i<arr.length; i++){

			for(int j=0; j<=i ; j++){

				arr[i][j] = '*';
			}
		}

		System.out.println();

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
