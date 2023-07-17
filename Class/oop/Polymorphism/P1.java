class Demo{

	void fun(int x){                                  //fun(int)

		System.out.println(x);
	}

	int fun(float y){                               //fun(float)

		System.out.println(y);
	}

	void fun(Demo obj){                             //fun(Demo)

		System.out.println("In demo para");
		System.out.println(obj);
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(10.5f);
		Demo obj1 = new Demo();
		obj1.fun(obj);
	}
}

