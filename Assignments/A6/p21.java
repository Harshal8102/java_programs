/*   *****
 *   *   *
 *   *   * 
 *   *   *
 *   *****    */

class pattern{

	public static void main(String[] args){

		int row = 5;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				if(i%row==1 || i%row==0 || j%row==1 || j%row==0){

					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

