
//Given a matrix of size n*m. print all diagonals(R --> L)
//diagonal starting from 0 row

import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};


		for(int j = a[0].length-1; j>=0; j--){

			int i=0, k=j;

			while(i<a.length && k>=0){

				System.out.print(a[i][k] + "   ");
				i++;
				k--;
			}

			System.out.println();
		}
	

	}
}
