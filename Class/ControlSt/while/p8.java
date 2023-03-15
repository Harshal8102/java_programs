/* product of numbers*/

class product{

	public static void main(String[] args){

		int product = 1;
		int N = 6531;

		while(N != 0){

			int rem = N % 10 ;
			product = product * rem;
			N = N/10;
		}
		System.out.println(product);
	}
}
