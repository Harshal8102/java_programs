
//print column wise sum of 2d matrix


import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		for(int i=0; i<a[0].length; i++){

			int sum = 0;

			for(int j=0; j < a.length ; j++){

				sum += a[j][i];

			}

			System.out.println(sum);
		}

	}
}
