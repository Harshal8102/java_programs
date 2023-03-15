/* Given an integer input
 * print all its digit
 * input = 6531
 * output 1
 *        3
 *        5
 *        6*/

class ifelse{
	public static void main(String[] args){

		int N = 6531;

		while(N != 0){

			System.out.println(N%10);
			N = N/10;
		}
	}
}

