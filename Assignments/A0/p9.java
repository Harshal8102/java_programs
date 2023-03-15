class pythagoras{

	public static void main(String[] args){

		int a=3,b=4,c=5;

		if((a*a + b*b == c*c) || (a*a + c*c == b*b) || (c*c + b*b == a*a)){
			
			System.out.println("its a Pythagorean triplet");
		}else{

			System.out.println("It is not pythagorean triplet");

		}
	}
}
