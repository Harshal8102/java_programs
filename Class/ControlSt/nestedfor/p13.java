/* 1
 * 4  3
 * 16 5  36
 * 49 8  81 10 */

class c2w{

	public static void main(String[] args){

		int n=1;
		int row=4;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){

				if(j%2!=0){

					System.out.print(n*n + "   ");
				}else{
					System.out.print(n + "  ");
				}
				n++;
			}
			System.out.println();
		}
	}
}
