
import java.util.*;
class DoubleRecurrsion{

	int stackCount = 0;

	int fun(int num){

		if(num <= 1){

			stackCount++;
			return 1;
		}

		stackCount++;

		return fun(num-2) + fun(num-1);
	}

	public static void main(String[] args){

		
		DoubleRecurrsion obj = new DoubleRecurrsion();

		obj.stackCount++;

		int ret = obj.fun(5);

		System.out.println(ret);

		System.out.println(obj.stackCount);
	}
}

