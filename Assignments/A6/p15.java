/* A  B  C  D
 * B  C  D
 * C  D
 * D         */

class c2w{

	public static void main(String[] args){

		int row=4;
		char ch = 'A';

		for(int i=1; i<=row; i++){

			char ch2 = ch;

			for(int j=1; j<=row-i+1; j++){

				System.out.print(ch2++ + "  ");
			}

			System.out.println();
			ch++;
		}
	}
}

