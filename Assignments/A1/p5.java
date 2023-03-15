/*Square of even character*/

class square{

	public static void main(String[] args){

		long N = 942111423;
		long rem;

		while(N != 0){

			rem = N % 10;
			if(rem % 2 == 0){

				System.out.println(rem*rem);
			}
			N = N/10;
		}
	
	}
}
