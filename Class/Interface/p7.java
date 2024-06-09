interface Demo1{

	static void fun(){

		System.out.println("in fun demo1");
	}
}
interface Demo2{

	static void fun(){

		System.out.println("in fun demo2");
	
	}
}
class DemoChild implements Demo1,Demo2{
	static void fun(){

		System.out.println("in fun child");
		Demo1.fun();
		Demo2.fun();
	}
}
class Client{

	public static void main(String[] args){

		DemoChild obj = new DemoChild();
		obj.fun();
	}
}
