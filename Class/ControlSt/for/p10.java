/*Find prime number from 1 to 100*/

class prime{

	public static void main(String[] args){


		for(int N=1; N<=1000; N++){
			
			int count = 0;

			for(int i=1; i<=N ; i++){

				if(N%i == 0){

					count++;
				}
			}
			
			if(count == 2){

				System.out.println(N + " is prime number");
			}
		}
	}
}

