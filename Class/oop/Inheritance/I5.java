class Parent{

	static{
		System.out.println("In parent static block");
	}

	static void fun(){

		System.out.println(10);
	}
}

class Child extends Parent{

	static{
		System.out.println("In child static block");
	}
}
class Client{	

	public static void main(String[] args){

	
		Child obj = new Child();
		obj.fun();
	}
}
