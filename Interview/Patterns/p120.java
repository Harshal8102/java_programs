import java.util.*;
class demo{

	static void printDiamond(int row){

		int n = 1;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("    ");
				}else{
					System.out.print(n + "   ");
					if(j < row){
						n++;
					}else{
						n--;
					}
				}
			}
			System.out.println();
			n++;
		}

		for(int i=row-1; i>=1; i--){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("    ");
				}else{
					System.out.print(n + "   ");
					if(j < row){
						n++;
					}else{
						n--;
					}
				}
			}
			System.out.println();
			n++;
		}
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of row");
		int row = sc.nextInt();

		printDiamond(row);
	}
}
