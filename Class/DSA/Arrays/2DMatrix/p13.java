
//Given n*m matrix
//print it in spiral fashion

import java.util.*;
class Demo{

	public static void main(String[] args){

		int a[][] = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

		int n = a.length,m = a[0].length;

		int i=0,j=0;

		while(n > 1){

			for(int x=0 ; x < m-1; x++){
				System.out.print(a[i][j] + "    ");
				j++;
			}
	
			for(int x=0 ; x < n-1 ; x++){
				System.out.print(a[i][j] + "    ");
				i++;
			}
	
			for(int x=0 ; x < m-1; x++){
				System.out.print(a[i][j] + "    ");
				j--;
			}

			for(int x=0 ; x < n-1; x++){
				System.out.print(a[i][j] + "    ");
				i--;
			}
	
			System.out.println();
			n -= 2;
			m -= 2;
			i++;
			j++;
		}

		if(n == 1){

			for(int x = 0; x < m ; x++){
				System.out.print(a[i][j] + "    ");
				j++;
			}
		}
		System.out.println();

	}
}
