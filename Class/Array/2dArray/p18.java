import java.util.*;
class demo{
	static void printSpiral(int arr[][]){

		int startrow = 0;
		int startcol = 0;
		int endrow = arr.length-1;
		int endcol = arr[0].length-1;

		while(startrow <= endrow && startcol <= endcol){

			//top
			for(int j=startrow; j<=endcol; j++){

				System.out.print(arr[startrow][j] + "   ");
			}
			//right

			for(int j=startrow+1; j<=endrow; j++){

				System.out.print(arr[j][endcol] + "   ");
			}
			//bottom
			for(int j=endcol-1; j>=startcol; j--){

				System.out.print(arr[endrow][j] + "   ");
			}

			//left
			for(int j=endrow-1; j>=startrow+1; j--){

				System.out.print(arr[j][startcol] + "   ");
			}
			startrow++;
			endrow--;
			startcol++;
			endcol--;
		}
					
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int arr[][] = new int[6][6];

		System.out.println("Enter array elements");

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){

				arr[i][j] = sc.nextInt();
			}
		}

		printSpiral(arr);
	}
}
