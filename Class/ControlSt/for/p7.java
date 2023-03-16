/*Take integer N as input. Print whether N is perfect number or not
 *
 * Define = Sum of factors of given number except that given number is equal to given number then it is perfect number*/

class perfect{

	public static void main(String[] args){

		int N = 4;
                int count = 0;

		for(int i=1; i<N ; i++){

			if(N % i == 0){

			count = count + i;
			}
		}

		if(count == N){

			System.out.println(N + " is perfect number");
		}else{
			System.out.println(N + " is not perfect number");
		}
	}
}

