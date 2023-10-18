//reverse a number & put successive number sum into an array & print it

import java.util.*;
class Demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  elements");
		int n = sc.nextInt();

		int reverse = 0;
		int count = 0,rem;

		while(n != 0){

			 rem = n % 10;
			reverse = reverse * 10 + rem;
			n /= 10;
			count++;
		}

		int ans[] = new int[count];
		int previous = 0;

		for(int i=count-1; i>=0; i--){
			rem = reverse % 10;
			ans[i] = rem + previous;
			previous = reverse % 10;
			reverse /= 10;
		}

		for(int x : ans)
			System.out.print(x + "   ");
		System.out.println();
	}
}
