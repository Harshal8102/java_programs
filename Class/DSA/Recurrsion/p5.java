
import java.util.*;
class SumOfN{
/*
	int sum(int n){

		if(n == 1)
			return 1;

		return n + sum(--n);
	}*/

	int sum = 0;
	int sum(int n){

		if(n == 0)
			return sum;

		sum = sum + n;

		sum(--n);

		return sum;
	}

	public static void main(String[] args){

		System.out.println("start main");

		SumOfN obj = new SumOfN();

		int ret = obj.sum(5);

		System.out.println(ret);

		System.out.println("End main");
	}
}

