interface Demo{

	int x = 10;

	static int y = 10;

	void fun();
}
class Client{

	public static void main(String[] args){

		System.out.println(Demo.x);
		System.out.println(Demo.y);
	}
}
