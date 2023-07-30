
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		int n = (row*(row+1))/2;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(j < row-(row-i)){

					System.out.print("   ");
				}else{
					
					if(i <= row/2){
						if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
							System.out.print(n*n + "  ");
						}else{
							System.out.print(n + "  ");
						}
					}else{
						if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
							System.out.print(n + "  ");
						}else{
							System.out.print(n*n + "  ");
						}
					}
					n--;
				}
			}

			System.out.println();
			
		}
	}
}

