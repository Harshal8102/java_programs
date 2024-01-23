class Parent{

	Parent(){

		System.out.println("Parent constructor");
	}
	void fun(){

		System.out.println("In parent fun");
	}
	
}
class Child extends Parent{

	Child(){

		System.out.println("Child constructor");
	}
	void fun(){
		System.out.println("In gun");
	}
}
class Client{

	public static void main(String[] args){

		Parent obj = new Child();
		obj.fun();
		//obj.gun();

		Parent obj2 = new Parent();
		obj2.fun();
	}
}

