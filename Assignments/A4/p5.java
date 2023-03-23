/* 12 12 12
 * 11 11 11
 * 10 10 10*/

class c2w{

	public static void main(String[] args){

		int n=12;

		for(int i=1 ; i<=3; i++){

			for(int j=1 ; j<=3; j++){

				System.out.print(n + " ");
			}
			System.out.println();
			n--;
		}
	}
}
