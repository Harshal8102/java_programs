/* 1                    2
 * 3  4              5  6
 * 7  8  9        10 11 12
 * 13 14 15 16 17 18 19 20
 * 20 19 18 17 16 15 14 13
 * 12 11 10       9  8  7
 * 6  5              4  3
 * 2                    1     */

import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int row = sc.nextInt();
		int n = 1;
               
		//first half
		for(int i=1; i<=row; i++){

			for(int j=1; j<=row+row; j++){

				if(j <= i){
					System.out.print(n++ + "  ");
				}else if((j > i) && (j<=2*(row-i)+i)){
					System.out.print("   ");
				}else{
					System.out.print(n++ + "  ");
				}
			}
			System.out.println();
		}
		n--;
		//second half
		for(int i=row; i>=1; i--){			
			
			for(int j=1; j<=row+row; j++){

				if(j<= i){

					System.out.print(n-- + "  ");
				}else if((j>i) && (j<=2*(row-i)+i)){
					System.out.print("   ");
				}else{
					System.out.print(n-- + "  ");
				}
			}
			System.out.println();
		}
	}
}
