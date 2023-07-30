
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int x = row;
		int n = row*row;

		for(int i=0; i<row; i++){

			for(int j=0 ;j<x; j++){

				if(n%2!=0){
					System.out.print(n  + "   ");
				}else{
					System.out.print(n*n + "   ");
				}
				n--;
			}
			System.out.println();
		}
	}
}
