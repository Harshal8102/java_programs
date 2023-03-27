/*  *****
 *   ***
 *   ***
 *  ***** */

class pattern {

	public static void main(String[] args){

		int row = 5;

		for(int i=1; i<row; i++){

			for(int j=1; j<=row; j++){

				if((i==2 && j==1) || (i==3 && j==1) || (i==2 && j==row) || (i==3 && j==row)){

					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

