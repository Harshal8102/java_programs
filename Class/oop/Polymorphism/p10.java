class Demo{

	void fun(Object obj){

		System.out.println("Object para");
	}

	void fun(String str){

		System.out.println("String");
	}
}
class Client{

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun("core2web");
		obj.fun(new StringBuffer("core2web"));
		obj.fun(null);
	}
}

