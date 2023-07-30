
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		char ch = (char)(96+row);

		for(int i=1; i<=row; i++){

			char c = ch;

			for(int j=0; j<row-i; j++){
				System.out.print("  ");
			}

			for(int k=0; k<i; k++){
				System.out.print(c + " ");
			}

			System.out.println();
			ch--;
		}
	}
}
