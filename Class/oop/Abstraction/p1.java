
abstract class Parent{

	void career(){
		System.out.println("engineering");
	}
	abstract void marry();
}
class Child extends Parent{

	void marry(){
		System.out.println("disha patani");
	}
}
class Client{

	public static void main(String[] args){
		Parent obj = new Child();
		obj.marry();
		obj.career();
	}
}
