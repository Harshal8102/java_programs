
import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		int n = (row*(row+1))/2;
		char ch = (char)(64+n);

		for(int i=0; i<row; i++){

			for(int j=0 ;j<=i; j++){

				if(i%2==0){
					System.out.print(n + "    ");
				}else{
					System.out.print(ch + "    ");
				}
				n--;
				ch--;
			}
			System.out.println();
		}
	}
}
