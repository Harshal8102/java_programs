public class Parent{

	 Parent(){
		System.out.println("In parent constructor");
	}

	static int x = 10;

	static{
		System.out.println("In parent static block");
	}

	static void access(){

		System.out.println(x);
	}
}
class Child extends Parent{

	Child(){
		System.out.println("In child constructor");
	}

	static{
		System.out.println("In child static block");
		System.out.println(x);
		access();
	}
}
class Client{

	public static void main(String[] args){

		System.out.println("In main");
		Child obj = new Child();
	}
}

