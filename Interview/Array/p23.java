//palindrome in 2d array
import java.io.*;
class demo{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the no. of rows");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter the no. of columns");
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];
		int z = 10;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
			
				for( ;  ;z++ ){
					int n = z;
					int reverse = 0;
					while(n != 0){
						int rem = n % 10;
						reverse	= reverse * 10 + rem;
						n = n / 10;
					}
					if(reverse == z){

						arr[i][j] = z++;
						break;
					}
				}
			}
		}
	
		System.out.println("Palindrome array is");

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}
}

