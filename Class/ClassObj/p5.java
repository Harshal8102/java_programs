class Demo{

	int x = 10;
	String str ="shashi";

	void fun(){

		String str2 = "shashi";
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
		String str3 = new String("core2web");
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		obj.fun();
	}
}
