

//print boundary in clockwise direction

import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};


		int i=0,j=0;

		for( ; j<a[0].length-1; j++){
			System.out.print(a[i][j] + "    ");
		}

		for( ; i<a.length-1 ; i++){
			System.out.print(a[i][j] + "    ");
		}

		for( ; j > 0; j--){
			System.out.print(a[i][j] + "    ");
		}

		for( ; i > 0; i--){
			System.out.print(a[i][j] + "    ");
		}
	
		System.out.println();
	}
}
