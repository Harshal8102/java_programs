//check whether the given number is palindrome or not

import java.io.*;
class Recurrsion{

	long reverse = 0;

	long reverseNumber(long num){

		if(num == 0)
			return 0;

		reverse = reverse * 10 + num%10;
		reverseNumber(num / 10);

		return  reverse;
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		long num = Integer.parseInt(br.readLine());

		long reverse = obj.reverseNumber(num);

		if(reverse == num){
			System.out.println(num + " is palindrome");
		}else{
			System.out.println(num + " is not palindrome");
		}
	}
}
