class Parent{

	Object fun(){
		System.out.println("Parent fun");
		return new Object();
	}
}
class Child extends Parent{

	StringBuffer fun(){

		System.out.println("child fun");
		return new StringBuffer("core2web");
	}
}

class Client{

	public static void main(String[] args){

		Parent p = new Child();
		p.fun();
	}
}
