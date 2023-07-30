/* 3C 3C 3C 3C
 * 3C 3C 3C
 * 3C 3C 
 * 3C         */

class c2w{

	public static void main(String[] args){

		int row=4;

		for(int i=1; i<=row; i++){
			char ch= 'C';
			int n=3;

			for(int j=1; j<=row-i+1; j++){

				System.out.print(n + "" + ch + "  ");
			}
			System.out.println();
		}
	}
}
