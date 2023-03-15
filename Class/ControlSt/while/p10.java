 /* reverse */


class reverse{

	public static void main(String[] args){

		int reverse = 0;
		int N = 6251;

		while(N != 0){

			int rem = N % 10;
			N = N/10;

			reverse = reverse * 10 + rem;
		}

		System.out.println(reverse);
	}
}
