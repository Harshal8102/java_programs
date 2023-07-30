
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int n = row;
		char ch = (char)(row+64);

		for(int i=0; i<row; i++){

			char c = ch;
			int no = n;

			for(int j=0 ;j<row-i; j++){

				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)  ){
					System.out.print(no  + "   ");
				}else{
					System.out.print(c + "   ");
				}
				c--;
				no--;
			}
			System.out.println();
			ch--;
			n--;
		}
	}
}
