import java.io.*;
class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter length of 2D array");
		int len = Integer.parseInt(br.readLine());

		int arr[][] = new int[len][];

		System.out.println("Enter length of 1d array's of 2d array:");

		for(int i=0; i<arr.length; i++){

			int size = Integer.parseInt(br.readLine());

			arr[i] = new int[size];
		}

		System.out.println("Enter elements of 2d array");

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



