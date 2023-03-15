/* palindrome */

class palindrome{

	public static void main(String[] args){

		int num = 1001;
		int rem;
		int reverse=0 ;
		int number = num;

		while(num != 0){

			rem = num % 10;
			num = num / 10;

			reverse = reverse * 10 + rem;
		}
		System.out.println(reverse);

		if( number == reverse ){
			System.out.println("It is palindrome number");
		}else{
			System.out.println("It is not palindrome number");
         	}  
   	}
}

