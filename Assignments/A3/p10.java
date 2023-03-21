/* Palindrome or not */

class reverse{

	public static void main(String[] args){

		int n = 2332;
                int reverse=0;
		int temp=n,rem;

		for(   ; temp!=0 ;   ){

			rem = temp % 10;

			reverse = reverse * 10 + rem;

		        temp = temp / 10;

		}

		
		if(reverse == n){

			System.out.println("It is palindrome number");
		}else{
			System.out.println("It is not palindrome number");
		}

	}
}


