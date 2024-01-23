
class Parent{

	static void fun(){

		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("Child fun");
	}
}
class Client{

	public static void main(String[] args){

		Parent obj1 = new Parent();
		obj1.fun();                        //Parent fun

		Child obj2 = new Child();
		obj2.fun();                        //Child fun

		Parent obj3 = new Child();
		obj3.fun();                       //Parent fun
	}
}
