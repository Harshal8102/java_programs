//check if no. is a power of 2 or not

class demo{

	static boolean checkPower(int n){

		return (n&(n-1)) == 0;
	}
	public static void main(String[] args){


		int n = 9;

		System.out.println(checkPower(n));
	}
}
