
/*           1
 *         2 1 2  
 *       3 2 1 2 3 
 *     4 3 2 1 2 3 4
 *   5 4 3 2 1 2 3 4 5
 */


import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){
			int n = i;

			for(int j=1; j<=row+i-1 ; j++){

				if(j <= row-i){
					System.out.print("  ");
				}else{
					System.out.print(n + " ");
					if(j<row){
						n--;
					}else{
						n++;
					}
				}
			}
			System.out.println();
		}
	}
}
