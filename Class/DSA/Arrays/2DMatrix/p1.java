
//print 2d matrix row by row


import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int i=0; i<a.length; i++){

			for(int j=0; j < a[i].length ; j++){

				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}


	}
}
