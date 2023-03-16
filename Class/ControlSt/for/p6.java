/*To find prime number or not
 *
 * Define => The number whose factors are only two*/

class prime{

	public static void main(String[] args){

		int N = 23;
		int count = 0;

		for(int i=1; i<=N ; i++){

			if(N%i == 0){

				count++;
			}
		}

                if(count == 2){

			System.out.println(N + " is prime number");
		}else{
			System.out.println(N + " is not prime number");
		}
	}
}

