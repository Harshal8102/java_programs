/*Print pattern 
 * 5 5 5 5
 * 5 5 5 5
 * 5 5 5 5*/

class c2w{
	
	public static void main(String[] args){

		int n=5;

		for(int i=1; i<=3; i++){

			for(int j=1; j<=4; j++){

				System.out.print(n + " ");
			}

			System.out.println();
		}
	}
}

