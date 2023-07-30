
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
	
		int n = row;

		for(int i=0 ; i<row; i++){

			int a = n;


			for(int j=0 ;j<row-i; j++){

				System.out.print(a-- + "   ");
			}
			n--;
			System.out.println();
		}
	}
}
