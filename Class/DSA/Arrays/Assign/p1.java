//Reverse Integer


import java.util.*;
class Demo{

	static long reverse(long n){
		
		long reverse = 0;

		while(n!=0){

			long rem = n % 10;
			reverse = reverse * 10 + rem;
			n /= 10;
		}
		if((reverse >= -2147483648) && (reverse <= 2147483647))
			return reverse;

		return 0;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		long n = sc.nextLong();

		System.out.println(reverse(n));
	}
}
