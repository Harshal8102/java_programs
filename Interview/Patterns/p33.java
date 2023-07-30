
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		char ch = (char)(64+row);
		int n = row;

		for(int i=1; i<=row; i++){

			char c = ch;
			int x = n;
				
			for(int j=1 ;j<=row-i+1; j++){

				if(n%2!=0){
					System.out.print(c--  + "   ");
				}else{
					System.out.print(x-- + "   ");
				}
				
			}
			n--;
			ch--;
			System.out.println();
		}
	}
}
