
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		char ch = 'A';
		int num = 0;

		for(int i=1; i<=row; i++){

			int n = num;

			for(int j=1; j <= row+row-i; j++){

				if( j < row-row+i){
					System.out.print("    ");
				}else{
					System.out.print(ch + "" + n + "  ");
					ch++;
					n++;
				}
			}
			System.out.println();
			num += 2;
		}
	}

}


