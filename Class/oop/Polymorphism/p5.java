class Parent{
	Parent(){
		System.out.println("In parent constructor");
	}

	void fun(){
		System.out.println("In parent fun");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("In child constructor");
	}

	void fun(int x){
		System.out.println("In child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj = new Child();
		obj.fun(10);
	}
}
