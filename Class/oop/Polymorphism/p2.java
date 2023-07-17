class Parent{

	Parent(){

		System.out.println("Parent constructor");
	}
	void property(){

		System.out.println("Home,car,gold");
	}
	void marry(){

		System.out.println("Deepika padukone");
	}
}
class Child extends Parent{

	Child(){

		System.out.println("Child constructor");
	}
	void marry(){
		System.out.println("Alia bhatt");
	}
}
class Client{

	public static void main(String[] args){

		Child obj = new Child();
		obj.property();
		obj.marry();
	}
}

