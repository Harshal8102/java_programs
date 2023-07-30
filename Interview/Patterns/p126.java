import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+row-1; j++){

				if(j <= row-i+1){

					System.out.print("*   ");

				}else if((j > row-i+1)  && (j <= (row-i+1)+2*(i-1)-1)){

					System.out.print("    ");
				}else{
					System.out.print("*   ");
				}
			}
			System.out.println();
		}

		for(int i=row-1; i>=1; i--){

			for(int j=1; j<=row+row-1; j++){

				if(j <= row-i+1){
					System.out.print("*   ");
				}else if((j > row-i+1) && (j <= (row-i+1)+2*(i-1)-1)){

					System.out.print("    ");
				}else{
					System.out.print("*   ");
				}
			}
			System.out.println();

		}
	}
}


