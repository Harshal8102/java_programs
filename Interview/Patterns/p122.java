
import java.util.*;
class demo{

	static void printDiamond(int row){

		char ch = 'A';

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("    ");
				}else{
					if(i%2!=0){
						System.out.print(ch + "   ");
					}else{
						System.out.print((char)(ch+32) + "   ");
					}
				}
			}
			System.out.println();
			ch++;
		}
		ch -= 2;

		for(int i=row-1; i>=1; i--){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("    ");
				}else{
					if(i% 2!=0){
						System.out.print(ch + "   ");
					}else{
						System.out.print((char)(ch+32) + "   ");
					}
				}
			}
			System.out.println();
			ch--;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int row = sc.nextInt();

		printDiamond(row);
	}
}

