
import java.util.*;
class demo{

	static void printDiamond(int row){

		char ch = (char)(64+row);

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("    ");
				}else{
					System.out.print(ch + "   ");
					if(j < row){
						ch--;
					}else{
						ch++;
					}
				}
			}
			System.out.println();
			ch--;
		}

		for(int i=row-1; i>=1; i--){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("    ");
				}else{
					System.out.print(ch + "   ");
					if(j < row){
						ch--;
					}else{
						ch++;
					}
				}
			}
			System.out.println();
			ch--;
		}
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		printDiamond(row);
	}
}
