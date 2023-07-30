
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<= row+i-1; j++){

				if( j <= row-i){
					System.out.print("    ");
				}else{
					System.out.print("*   ");
				}
			}
			System.out.println();
		}
	}
}
