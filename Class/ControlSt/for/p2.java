/*Take N as input & print odd integer from 1 to N*/

class loops{

	public static void main(String[] args){

		int N = 6;

		for(int i=1; i<=N ; i++){

			if(i%2!=0){

				System.out.println(i);
			}
		}
	}
}
