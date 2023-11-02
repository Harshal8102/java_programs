//Check given number is  an abundant number or not
//(Abundant number is the sum of all its proper divisors, denoted by sum(n), is greater than the number's value)

import java.io.*;
class Recurrsion{

	/*boolean isAbundantNumber(int num){

		int sum = 0;

		for(int i=1; i<=num/2; i++){
			if(num%i == 0){
				sum += i;
			}
		}

		if(sum > num)
			return true;
		
		return false;
	}*/
		
	boolean isAbundantNumber(int num,int i,int sumOf){

		if(num <= 1)
			return false;

		if(i > num/2)
			return sumOf > num;

		if(num % i == 0)
			sumOf += i;

		return isAbundantNumber(num,i+1,sumOf);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isAbundantNumber(num,2,1))
			System.out.println(num + " is abundant number");
		else
			System.out.println(num + " is not abundant");
	}
}
