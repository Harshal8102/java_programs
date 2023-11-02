//Check whether the given number is palindrome or not


import java.io.*;
class Recurrsion{

	int reverse = 0;
	
	int reverseNumber(int num){

		if(num == 0)
			return 0;

		reverse = reverse * 10 + num%10;
		
		reverseNumber(num / 10);

		return reverse;
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		int reverse = obj.reverseNumber(num);

		System.out.println(reverse);

		if(num == reverse)
			System.out.println(num + " is palindrome");
		else
			System.out.println(num + " is not palindrome");
	}
}
