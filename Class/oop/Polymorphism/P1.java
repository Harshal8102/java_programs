class Demo{

	void fun(float x){                                  //fun(int)

		System.out.println("int float : " + x);
	}

	void fun(int y){                               //fun(float)

		System.out.println("in int : " + y);
		
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

