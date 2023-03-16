/*Find perfect numbers from 1 to 1000*/

class perfect{

	public static void main(String[] args){

	

		for(int n=1; n<=1000; n++){
			int count = 0;

			for(int i=1 ; i<n ; i++){

				if( n % i == 0){

					count = count + i;
				}
			}
			
			if(count == n){
				System.out.println(n + " is perfect number");
			}

		}
	}
}

