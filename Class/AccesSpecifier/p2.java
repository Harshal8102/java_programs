class Demo{

	int x = 10;
	private int y = 20;

	void fun(){

		System.out.println(x);
		System.out.println(y);
	}
}

class mainDemo{

	public static void main(String[] args){

		Demo obj = new Demo();

		obj.fun();

		System.out.println(obj.x);
		//stem.out.println(obj.y);
	
	}
}
