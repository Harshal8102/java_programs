/*program to reverse the given number*/

class reverse{

	public static void main(String[] args){

		int N = 942111423;
                int rem,reverse=0;

		for(    ; N!=0 ;  ){

			rem = N % 10;

			reverse = reverse * 10 + rem;

			N = N / 10;
		}

		System.out.println(reverse);

	}
}



