/*factorial of given number*/

class fact{

	public static void main(String[] args){

		int N=6;
		int fact=1;

		for(int i=1;i<=N; i++){

			fact = fact * i;
		}

		System.out.println(fact);

	}
}

