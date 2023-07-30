
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		char ch = (char)(row+64);

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+row-i; j++){

				if( j < row-row+i){
					System.out.print("    ");
				}else{
					if(i%2!=0){

						System.out.print(ch + "   ");
					}else{
						System.out.print((char)(ch+32) + "   ");
					}
					if(j < row){
						ch--;
					}else{
						ch++;
					}

				
				}
			}
			System.out.println();
			ch -= 2;
		}
	}
}
