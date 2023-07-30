
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		char c = 'A';

		for(int i=1; i<=row; i++){

			char ch = c;

			for(int j=1; j<=row; j++){

				if(j <= row-i){

					System.out.print("   ");
				}else{
					if(i%2 == 0){

						System.out.print((char)(ch+32) + "  ");
						ch--;
					}else{
						System.out.print(ch + "  ");
						ch += 2;
					}
				}
			}
			System.out.println();
			c++;
		}
	}
}
