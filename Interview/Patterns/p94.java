
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int num = 1;
		for(int i=1; i<=row; i++){

			int n = num;

			for(int j=1; j<= row+row-i; j++){

				if(j < row-row+i){
					System.out.print("   ");
				}else{
					System.out.print(n + "  ");
					if(j == row){
						num = n;
					}
					if(i%2!=0){
						if(j < row){
							n += 2;
						}else{
							n -= 2;
						}
					}else{
						if(j < row){
							n -= 2;
						}else{
							n += 2;
						}
					}
				}
			}
			System.out.println();
		}
	}
}

