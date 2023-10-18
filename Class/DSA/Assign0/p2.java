//check no is armstrong or not

import java.util.*;
class Demo{

	static boolean checkArmstrong(int n){

		int temp = n,count=0;
		int temp1 = n;
		while(temp != 0){
			count++;
			temp /= 10;
		}

		int sum = 0;
		while(temp1 != 0){

			int rem = temp1 % 10;
			int mul = 1;

			for(int i=1; i<=count; i++)
				mul *= rem;

			sum += mul;
			temp1 /= 10;
		}

		if(sum == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an elements");
		int n = sc.nextInt();

		if(checkArmstrong(n)){

			System.out.println(n + " is armstrong number");
		}else{
			System.out.println(n + " is not armstrong number");
		}
	}
}
