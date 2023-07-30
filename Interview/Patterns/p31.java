
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		
		char ch = (char)(row+96);

		for(int i=1; i<=row; i++){

			for(int j=0 ;j<row-i+1; j++){

				if(i%2!=0){
					System.out.print(ch  + "   ");
				}else{
					System.out.print((char)(ch-32) + "   ");
				}
				
			}
			System.out.println();
			ch--;
		}
	}
}
