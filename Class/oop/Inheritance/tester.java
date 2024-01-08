class A{
	static {
		System.out.println("A static");
	}

	A(){
		System.out.println("A constructor");
	}
}
class B extends A{

	static{
		System.out.println("B static");
	}
	B(){
		System.out.println("B constructor");
	}
}

public class tester{

	static {
		System.out.println("tester static");
	}

	public static void main(String[] args){

		A a = null;

		A a2 = new A();

		B b = new B();
	}
}
