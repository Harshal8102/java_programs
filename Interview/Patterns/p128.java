
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no. of rows");
		int row = sc.nextInt();
		int n =1;
		char ch = 'a';
		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+i-1; j++){

				if(j <= row-i){

					System.out.print("    ");
				}else{
					if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){

						System.out.print(ch + "   ");
					}else{
						System.out.print(n + "   ");
					}
					ch++;
					n++;
				}
			}
			System.out.println();

			n -= 2*i-1;
			ch -= 2*i-1;
		}
	}
}
