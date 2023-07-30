
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int x = row;
		char ch = (char)(64+row);
		for(int i=0; i<row; i++){
			
			for(int j=0 ;j<x; j++){

				if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){

					System.out.print(ch + "   ");
				}else{
					System.out.print((char)(ch+32) + "   ");
				}

				if(i%2 == 0){
					ch--;
				}else{
					ch++;
				}

			}
			
			if(i%2 == 0){
				ch++;
				if(ch != 'A'){
					ch--;
				}		
			}else{
				ch--;
				ch+=2;
			}

			System.out.println();
		
		}
	}
}
