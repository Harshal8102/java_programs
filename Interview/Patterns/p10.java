
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int x = row;
		int y = 1;
		for(int i=0; i<row; i++){

			for(int j=0 ;j<x; j++){

				System.out.print(y + "   ");
				y+=3;
			}
			System.out.println();
		}
	}
}
