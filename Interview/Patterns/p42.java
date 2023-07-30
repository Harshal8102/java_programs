
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = row;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(j <= row-i){

					System.out.print("   ");
				}else{
					
					if(i %2 == 0){

						System.out.print(n++ + "  ");
					}else{
						System.out.print(n-- + "  ");
					}
				}
			}

			if(i%2==0){
				n -= i;
			}else{
				n += i;
			}

			System.out.println();
		}
	}
}
