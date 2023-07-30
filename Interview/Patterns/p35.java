//Hollow rectangle



import java.util.*;
class demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("ENtre the number of rows");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns");
		int col = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1 ;j<=col; j++){

				if(i%row==1 || i%row==0 || j%col==1 || j%col==0){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
