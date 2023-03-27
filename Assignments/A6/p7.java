/* F
 * E F
 * D E F
 * C D E F
 * B C D E F
 * A B C D E F */

class c2w{

	public static void main(String[] args){

		char ch = 'F';
		int row=6;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){

				System.out.print(ch++ + "  ");
			}

			System.out.println();
			ch -= (i+1);
		}
	}
}
