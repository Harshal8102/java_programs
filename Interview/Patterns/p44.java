
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = 1;
		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(j <= row-i){

					System.out.print("   ");
				}else{

					if(i%2==0){

						if(j%2!=0){
							System.out.print((char)(n+64) + "  ");
						}else{
							System.out.print((char)(n+96) + "  ");
						}
					}else{
						System.out.print(n + "  ");
					}

					n++;
				}
			}
			System.out.println();
			n-=i;	
		}
	}
}
