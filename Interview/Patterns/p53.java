
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		char ch = (char)(96+row);

		for(int i=0; i<row; i++){

			for(int j=0; j<row; j++){

				if(j < row-(row-i)){
					System.out.print("   ");
				}else{
					System.out.print(ch + "  ");
				}
			}
			ch--;
			System.out.println();
		}
	}
}

