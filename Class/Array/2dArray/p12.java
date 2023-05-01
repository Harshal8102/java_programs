import java.io.*;

class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of 2d array in 3d array");
		int size = Integer.parseInt(br.readLine());
		int arr[][][] = new int[size][][];

		
		for(int z=0;z<arr.length;z++){
			System.out.println("Enter no. of 1d array in each 2d array");
			int len = Integer.parseInt(br.readLine());
			arr[z] = new int[len][];

			for(int i = 0; i<arr[z].length; i++){

				System.out.println("Enter no. of elements in each 1d array");
				int le = Integer.parseInt(br.readLine());
				arr[z][i] = new int[le];

				System.out.println("Enter 1d array elements:");
				
				for(int j=0; j<arr[z][i].length; j++){

					arr[z][i][j] = Integer.parseInt(br.readLine());
				}
			}
		}
		for(int z=0;z<arr.length;z++){

			for(int i = 0; i<arr[z].length; i++){
				
				for(int j=0; j<arr[z][i].length; j++){

					System.out.print(arr[z][i][j] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

		

		


