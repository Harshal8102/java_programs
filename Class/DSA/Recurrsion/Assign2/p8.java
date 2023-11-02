//check whether a given positive integer is a perfect number or not
//(perfect no. = is positive integer that is equal to sum of its proper divisors, excluding itself)

import java.io.*;
class Recurrsion{

	/*boolean isPerfectNumber(int num){

		int sum = 0;

		for(int i=1; i<=num/2; i++){
			if(num % i == 0){
				sum += i;
			}
		}

		return sum == num;
	}*/

	boolean isPerfectNumber(int num,int i,int sum){

		if(i > num/2)
			return num==sum;

		if(num % i ==0)
			sum += i;

		return isPerfectNumber(num,i+1,sum);
	}


	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isPerfectNumber(num,1,0)){
			System.out.println(num + " is perfect number");
		}else{
			System.out.println(num + " is not perfect no.");
		}
	}
}
