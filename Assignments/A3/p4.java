/*count odd digit of the given number*/

class digitcount{

	public static void main(String[] args){

		int N = 942111423;
		int count=0,rem;

		for(   ;N != 0;    ){

			rem = N % 10;

			if(rem % 2 != 0){

				count++;

			}
			
			N = N / 10;

		}

		System.out.println(count);
	}
}
