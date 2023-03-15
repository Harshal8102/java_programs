class palindrome{

	public static void main(String[] args){

		long Num = 233332;
		long temp = Num;
		long reverse = 0;

		while(Num != 0){

			long rem = Num % 10;
			reverse = reverse * 10 + rem;
			Num = Num / 10;
		}

		if(reverse == temp){
			System.out.println("It is palindrome");
		}else{
			System.out.println("It is not palindrome");
		}
	}
}

