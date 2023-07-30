
import java.util.*;

class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];

		System.out.println("Enter array elements:");
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){

				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr[0].length; i++){
			int temp = arr[0][i];
			arr[0][i] = arr[2][i];
		       arr[2][i] = temp;
		}

 	
		System.out.println("new array");
		for(int x[] : arr){
			for(int y : x){
				System.out.print(y + "    ");
			}
			System.out.println();
		}		
	}
}

