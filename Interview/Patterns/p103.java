
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int num = 1;
		for(int i=1; i<=row; i++){

			int n = num;

			for(int j=1; j<=i+i-1; j++){

				System.out.print(n-- + "   ");
			}
			System.out.println();
			num += 2;
		}
		num -= 4;

		for(int i=row-1; i>=1; i--){

			int n = num;

			for(int j=1; j<=i+i-1; j++){

				System.out.print(n-- + "   ");
			}
			System.out.println();
			num -= 2;

		}
		
	}
}
