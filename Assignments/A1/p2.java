/*Program to calculate factorial of no.*/

class factorial{

	public static void main(String[] args){

		int i = 6;
		int factorial = 1;

		while(i>=1){

			factorial = factorial * i;
			i--;
		}
		System.out.println(factorial);
	}
}


