
//Non tail Recurrsion

class Recurrsion{

	void fun(int num){

		if(num == 0)
			return ;

		fun(--num);

		System.out.println(num);
	}

	public static void main(String[] args){

		System.out.println("start main");

		Recurrsion obj = new Recurrsion();

		obj.fun(5);

		System.out.println("End main");
	}
}

