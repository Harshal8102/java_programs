
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int row = sc.nextInt();
		int num = row+row-1;
	
		for(int i=1; i<=row; i++){

			int n = num;

			for(int j=1; j<=row+row-i; j++){

				if(j < row-row+i ){

					System.out.print("    ");
				}else{
					if(j%2==0){
						System.out.print(n + "   ");
					}else{
						System.out.print((char)(n+96) + "   ");
					}
					n--;
				
				}
			}
			System.out.println();
			num -= 2;
		}
	}
}
