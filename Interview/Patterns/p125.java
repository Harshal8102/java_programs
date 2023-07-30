
import java.util.*;
class demo{

	static void printDiamond(int row){

		int n = 1 ;
		int mul;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("     ");
				}else{
					if(j <= row){
						mul = n*(row-j+1);
					}else{
						mul = n*(j-row+1);
					}
				
					System.out.print(mul + "    ");
				}
			}
			System.out.println();
			n++;
		}
		n -= 2;

		for(int i=row-1; i>=1; i--){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("     ");
				}else{
					if(j <= row){
						mul = n*(row-j+1);
					}else{
						mul = n*(j-row+1);
					}
					System.out.print(mul + "    ");
				}
			}
			System.out.println();
			n--;
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		printDiamond(row);
	}
}
