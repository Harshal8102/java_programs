
import java.util.*;
class demo{

	static int printSumDiagonal(int arr[][]){

		int sum = 0;

		/*for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length; j++){

				if(i == j){
					sum += arr[i][j];
				
				}else if(i+j == arr.length-1){

					sum += arr[i][j];
				}
			}
		}*/

		for(int i=0; i<arr.length; i++){

			sum += arr[i][i];

			sum += arr[i][arr.length-1-i];
		}

		return sum;
	}



	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[3][3];

		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){

				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("sum of both diagonal of arr " + printSumDiagonal(arr));
	}
}

