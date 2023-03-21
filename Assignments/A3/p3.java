/*count digit of given number*/

class digitcount{

	public static void main(String[] args){

		int N=942111423;
		int count=0;

		for(   ;N != 0;   ){

			count++;
			N = N / 10;

		}

		System.out.println(count);

	}
}


			
