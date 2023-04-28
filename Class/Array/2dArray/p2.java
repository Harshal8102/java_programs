import java.io.*;
class Arraydemo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[][] = new int[2][3];

		System.out.println("Enter 2d array elements");

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length; j++){

				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length; j++){

				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}


