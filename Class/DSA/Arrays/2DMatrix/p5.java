
//print sum of entire matix


import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

		int sum = 0;
		for(int i=0; i<a.length; i++){

			for(int j=0; j < a[i].length ; j++){

				sum += a[i][j];
			}
	
		}

		System.out.println(sum);


	}
}
