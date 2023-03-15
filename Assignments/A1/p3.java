/* program to count the digits of the given number*/

class count{

	public static void main(String[] args){

		long N = 94211100;

		int count = 0;

		while(N != 0){

			count++;

			N = N/10;
		}
		System.out.println(count);
	}
}

                                    
