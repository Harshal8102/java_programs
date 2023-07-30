/*  F
 *  E 1
 *  D 2 E
 *  C 3 D 4
 *  B 5 C 6 D
 *  A 7 B 8 C 9 */

class c2w{

	public static void main(String[] args){

		int row = 6;
		int n = 1;
		char ch = 'F';

		for(int i=1; i<=row; i++){

			char ch2 = ch;

			for(int j=1; j<=i; j++){

				if(j%2!=0){
					System.out.print(ch2++ + "  ");
				}else{
					System.out.print(n++ + "  ");
				}
			}
			
			System.out.println();
			ch--;
		}
	}
}

