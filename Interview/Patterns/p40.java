
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = 1;
		for(int i=1 ; i<=row; i++){

			for(int j=0; j<row-i; j++){
				System.out.print("     ");
			}

			for(int k=0 ;k < i ; k++){
				System.out.print(n + "   ");
				n+=row;
			}

			System.out.println();
		}
	}
}
