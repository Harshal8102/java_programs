//Run-time exception
//Arithmatic exception

class Demo{

	void m2(){

		System.out.println("start m2");
		System.out.println(10/0);
		System.out.println("End main");
	}
	void m1(){

		System.out.println("start m1");
		m2();
		System.out.println("End m1");
	}
	public static void main(String[] args){

		System.out.println("start main");
		Demo obj = new Demo();
		obj.m1();
		System.out.println("End main");
	}
}

