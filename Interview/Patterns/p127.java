import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int row = sc.nextInt();
		int num = 1;
		for(int i=1; i<=row; i++){

			int n = num;

			for(int j=1; j<=row+row-1; j++){

				if(j <= (row+row-1)-(2*i-1)){
					System.out.print("    ");
				}else{
					System.out.print(n-- + "   ");
				}
			}
			System.out.println();
			num += 2;
		}
		num -= 4;

		for(int i=row-1; i>=1; i--){

			int n = num;

			for(int j=1; j<=row+row-1; j++){

				if(j <= (row+row-1)-(2*i-1)){

					System.out.print("    ");
				}else{

					System.out.print(n-- + "   ");
				}
			}
			System.out.println();
			num -= 2;
		}
	}
}
