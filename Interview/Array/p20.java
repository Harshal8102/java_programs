import java.io.*;
class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no. of rows");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter the no. of columns");
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];

		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		System.out.println("2d array elements are:");

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}
}

