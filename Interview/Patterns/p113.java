
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		char ch = (char)(row+64);

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(j <= row-i){
					System.out.print("   ");
				}else{
					System.out.print(ch++ + "  ");
				}	
			}
			System.out.println();
			ch-=i+1;
		}
		ch+=2;

		for(int i=row-1; i>=1; i--){
			for(int j=1; j<=row; j++){

				if(j <= row-i){
					System.out.print("   ");
				}else{
					System.out.print(ch++ + "  ");
				}
			}
			System.out.println();
			ch-=i-1;
		}	
	}
}
