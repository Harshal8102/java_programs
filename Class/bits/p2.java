//check no. odd or even

class demo{

	public static void main(String[] args){

		int n = -5;


		int bitmask = 1;

		if((n & bitmask)==0){

			System.out.println(n + " is even");
		}else{
			System.out.println(n + " is odd");
		}
	}
}
