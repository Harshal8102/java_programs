

//Given a matrix of size n*m. 
//Rotate matrix 90 degree  clockwise from top right corner

import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		int temp;
		for(int i=0; i<a.length; i++){

			for(int j = i+1; j<a[i].length; j++){

				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		for(int i=0; i<a.length; i++){

			int start = 0,end = a[i].length-1;

			while(start < end){

				temp = a[i][start];
				a[i][start] = a[i][end];
				a[i][end] = temp;
				start++;
				end--;
			}
		}

		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j] + "    ");

			System.out.println();

		}
	

	}
}
