//check number is armstrong number or not
//(armstrong number = is equal to sum of its own digits each raised to power of number of digits)

import java.io.*;
class Recurrsion{

	/*boolean isArmstrong(int num){

		int temp1= num,temp2=num;
		int count = 0;
		while(temp2 != 0){

			count++;
			temp2 /= 10;
		}

		int sum = 0;
		while(temp1 != 0){
			int rem = temp1%10;

			int mul = rem;
			for(int i=1;i<count; i++)
				mul *= rem;

			sum += mul;
			temp1 /= 10;
		}

		return sum == num;
	}*/

	/* Recurrsion
	int countDigits(int n){
		
		if(n == 0)
			return 0;
		return 1 + countDigits(n/10);
	}*/

	int calculateSum(int num,int count){

		if(num == 0)
			return 0;

	/*	int mul = 1;
		for(int i=0;i<count; i++){
			mul = mul * (num%10);
		}*/

		int digit = num%10;

		return (int)Math.pow(digit,count) + calculateSum(num/10, count);
	}

	boolean isArmstrong(int num){
	//	int c = countDigits(num);
		int sum = calculateSum(num,(int)Math.log10(num)+1);//,c);
		return sum == num;
	}
				
	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isArmstrong(num))
				System.out.println(num + " is armstrong number");
		else
			System.out.println(num + " is not armstrong number");
	}
}
