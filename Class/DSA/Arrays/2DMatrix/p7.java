
//Given square matrix print right diagonal


import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int i=0,j=a[0].length-1;

		while(i<a.length && j>= 0){

			System.out.print(a[i][j] + "   ");
			i++;
			j--;
		}
		System.out.println();

	}
}
