class reverse{
	
	public static void main(String[] args){

		long N = 54624865;
		long reverse = 0;

		while(N != 0){

			long rem = N % 10;
			reverse = reverse * 10 + rem;
			N = N / 10;
		}
		System.out.println(reverse);
	}
}
