
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			int n = 1;
			char ch = 'A';

			for(int j=1; j<=row+i-1; j++){

				if( j <= row-i){
					System.out.print("   ");
				}else{
					if(i%2!=0){
						System.out.print(n + "  ");
					}else{
						if(j % 2 != 0){
							System.out.print(ch + "  ");
						}else{
							System.out.print((char)(ch+32) + "  ");
						}
					}

					if(j < row){
						n++;
						ch++;
					}else{
						n--;
						ch--;
					}
				}
			}
			System.out.println();
		}
	}
}

