/*print square of even digit of given number*/

class digit{

	public static void main(String[] args){

		int N = 942111423;
		int rem;

		for(   ; N!=0 ;   ){

			rem = N % 10;

			if(rem%2==0){

				System.out.println(rem * rem);

			}

			N = N / 10;
		}
	}
}

