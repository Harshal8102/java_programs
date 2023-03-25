/* A 1 B 2
 * C 3 D
 * E 4
 * F      */

class c2w{

	public static void main(String[] args){

		char ch = 'A';
		int n = 1;
		int row=4;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row-i+1; j++){

				if(j%2==0){
					System.out.print(n++ + "  ");
				}else{
					System.out.print(ch++ + "  ");
				}
			}
			System.out.println();
		}
	}
}

