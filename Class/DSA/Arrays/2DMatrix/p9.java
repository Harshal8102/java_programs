
//Given a matrix of size n*m. print all diagonals(L --> R)
//diagonal starting from 0 row

import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};


		for(int j = 0; j<a[0].length; j++){

			int i=0, k=j;

			while(i<a.length   && 	k < a[0].length){

				System.out.print(a[i][k] + "    ");
				i++;
				k++;
			}

			System.out.println();
		}
	

	}
}
