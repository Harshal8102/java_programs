//determine whether a given positive integer is a sad number or not

import java.util.*;
import java.io.*;
class Recurrsion{

	/*boolean isSadNumber(int num){

		Set<Integer> hm = new HashSet<Integer>();

		while(num != 1 && hm.add(num)){
			int sum = 0;

			while(num > 0){
				int temp = num%10;
				sum += temp*temp;
				num /= 10;
			}
			num = sum;
		}

		return !(num == 1);
	}*/

	int calSqSum(int num){

		if(num == 0)
			return 0;

		return (num%10)*(num%10) + calSqSum(num/10);
	}

	boolean isSadNumber(int num,Set<Integer> hm){

		if(num == 1)
			return false;

		if(!hm.add(num))
			return true;

		int n = calSqSum(num);

		return isSadNumber(n,hm);
	}

	public static void main(String[] args)throws IOException{

		Recurrsion obj = new Recurrsion();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());

		if(obj.isSadNumber(num,new HashSet<Integer>()))
			System.out.println(num + " is sad number");
		else
			System.out.println(num + " is not sad number");
	}
}
