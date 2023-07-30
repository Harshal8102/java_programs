
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		
		int n = 1;

		for(int i=1; i<=row; i++){

			int x = n;

			for(int j=0 ;j<row-i+1; j++){

				System.out.print(x++ + "   ");
			}

			n++;
			System.out.println();
		}
	}
}
