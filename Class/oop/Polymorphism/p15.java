class Parent{

	final void fun(){

		System.out.println("parent fun");
	}
}
class child extends Parent{

	
}
class Client{

	public static void main(String[] args){

		child obj = new child();
		obj.fun();
	}
}
	
