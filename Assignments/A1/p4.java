/* odd no. count from the given number*/

class count{

	public static void main(String[] args){

		int N = 942111423;

		int count = 0;

		while(N != 0){

			int rem = N % 10;

	        	if(rem % 2 != 0){

	                	count++;
		        }
                	N = N/10;
		}
		System.out.println(count);
	}
}
