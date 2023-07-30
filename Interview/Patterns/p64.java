
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		//first half
		for(int i=row; i>=1; i--){

			for(int j=1; j<=row+row; j++){

				if(j <= i){
					System.out.print("* ");
				}else if(j>i && j<=2*(row-i)+i){
					System.out.print("  ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		//second half

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+row; j++){

				if(j <= i){
					System.out.print("* ");
				}else if(j>i && j<=2*(row-i)+i){
					System.out.print("  ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
