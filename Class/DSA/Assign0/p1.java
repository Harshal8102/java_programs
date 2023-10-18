//print factorial of even number in a given number

class Demo{

	public static void main(String[] args){

		int n = 256946;

		int reverse = 0,rem;
		while(n != 0){
			rem = n % 10;
			reverse = reverse * 10 + rem;
			n /= 10;
		}

		while(reverse != 0){

			rem = reverse % 10;

			if(rem % 2 == 0){

				int fact = 1;
				for(int i=1; i<=rem; i++)
					fact *= i;

				System.out.println(fact);
			}

			reverse /= 10;
		}

	}
}


