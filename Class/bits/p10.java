// fast exponentiation of a power of  n

class demo{

	static int powerOf(int a, int n){

		int mul = 1;

		while(n > 0){

			if((n&1) != 0){

				mul = mul * a;
			}

			a = a * a;
			n = n>>1;
		}

		return mul;
	}

	public static void main(String[] args){

		int a = 7;
		int n = 8;

		System.out.println(powerOf(a,n));
	}
}

