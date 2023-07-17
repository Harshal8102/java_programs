class Demo{

	int x = 10;
	private int y=20;

	static int z = 30;
	static int m = 30;

	void display(){

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
class client{

	public static void main(String[] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.display();

		obj1.x = 100;
		Demo.z = 300;

		obj1.display();
		obj2.display();
		
	}
}
