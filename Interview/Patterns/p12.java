
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int x = row;
		char c = 'a';
		for(int i=0; i<row; i++){

			for(int j=0 ;j<x; j++){

				if(j % 2 == 0){
					System.out.print(c +"   ");
				}else{
					System.out.print((char)(c-32) + "   "); 
				}
				c++;
			}
			System.out.println();
			
		}
	}
}
