/*  1
 *  8  9
 *  9  64 25
 *  64 25 216  49 */

class c2w{

	public static void main(String[] args){

		int row=4;

		for(int i=1; i<=row; i++){

			int n=i;

			for(int j=1; j<=i; j++){

				if((j%2!=0  &&  i%2==0) || (j%2==0  &&  i%2!=0)){

					System.out.print(n*n*n + "   ");
				}else{
					System.out.print(n*n + "   ");
				}

				n++;
			}
			System.out.println();
		}
	}
}

