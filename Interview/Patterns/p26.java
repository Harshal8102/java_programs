
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		
		int n = row;
		for(int i=1; i<=row; i++){

			int x = 1;
			for(int j=0 ; j < n-i+1; j++){
				
				System.out.print(x++ + "   ");
			}

			System.out.println();
		}
	}
}
