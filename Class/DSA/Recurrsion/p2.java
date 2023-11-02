//Tail Recurrsion

class Recurrsion{

	void fun(int num){

		if(num == 0){
			return ;
		}

		System.out.println(num);

		fun(--num);

	}

	public static void main(String[] args){

		System.out.println("Start main");

		Recurrsion obj = new Recurrsion();

		obj.fun(5);

		System.out.println("End main");
	}
}


