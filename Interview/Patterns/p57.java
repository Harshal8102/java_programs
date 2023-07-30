
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		char ch = (char)(row+64);

		for(int i=1; i<= row; i++){

			for(int j=1; j<=row; j++){

				if(j <= row-(row-i+1)){

					System.out.print("   ");
				}else{
					if(i%2==0){

						System.out.print((char)(ch+32) + "  ");
					}else{
						System.out.print(ch + "  ");
					}
				}
			}
			ch--;
			System.out.println();
		}
	}
}

