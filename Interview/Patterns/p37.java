
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=0; i<row; i++){

			int n = 1;

			for(int j=0; j<row-1-i; j++){

				System.out.print("  ");
			}
			for(int k=0; k<=i ; k++){

				System.out.print(n++ + " ");
			}

			System.out.println();
		}
	}
}
