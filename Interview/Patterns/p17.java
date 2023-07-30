
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int x = row;
		int n = 1;
		char c = 'a';
		for(int i=0; i<row; i++){

			for(int j=0 ;j<4; j++){

				if(i%3==0){
					System.out.print(n++ + "   ");
				}else if(i%3==1){
					System.out.print(c++ + "   ");
				}else if( i%3==2){
					System.out.print("#   ");
				}
			}
			System.out.println();
		
		}
	}
}
