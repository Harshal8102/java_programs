//check given number is magic number or not.(magic number is a number in which the eventual sum of digits is equal to 1).


import java.io.*;
class Recurrsion{

	/*int checkMagicNumber(int num){

		int sum = 0;

		while(num > 9){

			while(num != 0){

				sum += num%10;
				num /= 10;
			}

			num = sum;
			sum = 0;
		}

		return num;
	}*/

	boolean isMagicNumber(int num){

		if(num <= 9)
			return num == 1;

		int n = calculateSum(num);

		return isMagicNumber(n);
	}

	int calculateSum(int num){
		
		if(num == 0)
			return 0;

		return num%10 + calculateSum(num/10);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isMagicNumber(num))
			System.out.println(num + " is magic number");
		else
			System.out.println(num + " is non magic number");
	}
}
