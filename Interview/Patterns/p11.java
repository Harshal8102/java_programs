
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int x = row;
		int n = (row*(row+1))/2;
		char  c = (char)(x+96);
		for(int i=0; i<row; i++){

			for(int j=0 ;j<x; j++){

				System.out.print(c + "   ");
			}
			System.out.println();
			c--;
		}
	}
}
