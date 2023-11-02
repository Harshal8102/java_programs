
class DoubleRecurrsion{

	int stackCount = 0;

	void fun(int num){

		if(num <= 1){
			stackCount++;
			return;
		}

		stackCount++;

		fun(num - 2);

		System.out.println(num);

		fun(num - 1);
	}

	public static void main(String[] args){

		DoubleRecurrsion obj = new DoubleRecurrsion();

		obj.stackCount++;

		obj.fun(5);

		System.out.println(obj.stackCount);
	}
}

