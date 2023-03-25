/* 1 
 * 4  9
 * 16 25 36
 * 47 64 81 100 */

class c2w{

	public static void main(String[] args){

		int n=1;
		int row=4;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){

				System.out.print(n*n + "  ");
				n++;
			}

			System.out.println();
		}
	}
}
