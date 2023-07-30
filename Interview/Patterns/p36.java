
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row-i; j++){

				System.out.print("  ");
			}
			for(int z=1; z<=i; z++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}

