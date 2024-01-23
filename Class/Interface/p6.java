interface Demo1{

	default void fun(){

		System.out.println("in fun demo1");
	}
}
interface Demo2{

	default void fun(){

		System.out.println("in fun demo2");
	}
}
class DemoChild implements Demo1,Demo2{

	public void fun(){

		System.out.println("in fun demochild");
	}
}
class Client{
	public static void main(String[] args){

		DemoChild obj = new DemoChild();
		obj.fun();
		Demo1 obj2 = new DemoChild();
		obj2.fun();
		Demo2 obj3 = new DemoChild();
		obj3.fun();
	}
}
