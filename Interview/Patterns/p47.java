import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = 1;
		for(int i=0; i<row; i++){

			for(int j=0; j<=i; j++){

				System.out.print(n++ + "  ");
			}
			System.out.println();

			n--;
		}
	}
}





