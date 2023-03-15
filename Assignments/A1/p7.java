/*if number is even print no. in reverse order
 * if number is odd print no. in reverse order by diff 2
 * input = 6     ==>   6 5 4 3 2 1
 * input = 7     ==>   7 5 3 1*/

class reverse{

	public static void main(String[] args){

		int i = 7;

		if(i%2==0){
			while(i != 0){
				
				System.out.println(i);
				i--;
			}
		}else{
			while(i > 0 ){ 

				System.out.println(i);
				i=i-2;
			}
		}
	}
}




