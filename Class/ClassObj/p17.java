class Demo{

	int x = 10;
	static int y= 20;

	static{

		System.out.println("static block 1");
	}

	public static void main(String[] args){

		System.out.println("main method");

		Demo obj = new Demo();

		System.out.println(obj.x);
	}

	static{

		System.out.println("static block 2");
		System.out.println(y);
	}

}
