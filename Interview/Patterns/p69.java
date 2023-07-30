
/*        _ _ _ _ 1
 *        _ _ _ 2  2
 *        _ _ 3  3  3
 *        _ 4  4  4  4
 *         5  5  5  5  5
 *
 *       
 *       Number Pyramid
 *     
 */


import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row ; j++){

				if(j <= row-i){
					System.out.print("  ");
				}else{
					System.out.print(i + "   ");
				}
			}
			System.out.println();
		}
	}
}
