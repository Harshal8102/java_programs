
//Default Exception handler

class Demo{

	void m1(){

		System.out.println(10/0);
		m2();
	}
	
	void m2(){

		System.out.println("In m2");
	}

	public static void main(String[] args){

		System.out.println("start main");
		Demo obj = new Demo();
		obj.m1();
		System.out.println("End main");
	}
}


