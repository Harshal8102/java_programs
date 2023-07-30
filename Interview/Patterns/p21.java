
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		char ch ='a';

		for(int i=0; i<row; i++){

			for(int j=0 ;j<=i; j++){

				System.out.print(ch++ + "    ");
			}
			System.out.println();
		}
	}
}
