
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = row;

		for(int i=1; i<=row; i++){

			// int  n = row;
			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){
					System.out.print("   ");
				}else{
					System.out.print(n + "  ");
					if(i%2==0){
						if(j < row){
							n++;
						}else{
							n--;
						}
					}else{
						if(j < row){
							n--;
						}else{
							n++;
						}
					}
				}
			}
			System.out.println();
			if(i%2==0){
				n++;
			}else{
				n--;
			}
		}
	}
}

			
