import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=0; i<row; i++){

			int n = 1;
			char ch = 'a';

			for(int j=0; j<row; j++){

				if(j < row-i-1){

					System.out.print("   ");
				}else{
					if((i%2==0 && j%2!=0) || (i%2!=0 && j%2==0)){

						System.out.print(ch + "  ");
					}else{
						System.out.print(n++ + "  ");
					}
					ch++;
				}
			}
			System.out.println();
		}
	}
}

