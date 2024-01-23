interface Demo{

	int x = 10;
	void fun();
	static int y = 20;
}
class DemoChild implements Demo{

	public void fun(){

		System.out.println(x);
		System.out.println(Demo.x);
	}
}
class Client{

	public static void main(String[] args){

		Demo obj = new DemoChild();
		obj.fun();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
