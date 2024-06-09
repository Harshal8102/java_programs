//determine given number is happy number or not
//happy number is number which eventually reaches 1 when replaced by sum of square of each digit)

import java.util.*;
import java.io.*;
class Recurrsion{

	/*boolean isHappyNumber(int num){

		Set<Integer> sawSet = new HashSet<Integer>();

		while(num!=1 && sawSet.add(num)){

			int sum = 0;

			while(num > 0){
				int temp = num%10;
				sum += temp*temp;
				num /= 10;
			}
			num = sum;
		}

		return num == 1;
	}*/

	int calSqSum(int num){

		if(num == 0)
			return 0;

		return (num%10)*(num%10) + calSqSum(num/10);
	}

	boolean isHappyNumber(int num,Set<Integer> sawSet){

		if(num == 1)
			return true;

		if(!sawSet.add(num))
			return false;

		int n = calSqSum(num);

		return isHappyNumber(n,sawSet);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isHappyNumber(num,new HashSet<Integer>()))
			System.out.println(num + " is happy number");
		else
			System.out.println(num + " is not happy number");

	}
}
