class Demo{

	void fun(String str){

		System.out.println("String");
	}

	void fun(StringBuffer str){

		System.out.println("StringBuffer");
	}

}
class Client{

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun("core2web");
		obj.fun(new StringBuffer("core2web"));
		//obj.fun(null);                         error: reference to fun is ambiguous
	}
}

