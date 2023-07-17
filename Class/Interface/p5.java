interface Demo1{

	static void m1(){

		System.out.println("Demo1-m1");
	}
}
interface Demo2{

	static void m1(){

		System.out.println("Demo2-m1");
	}
}

class Demo3 implements Demo1,Demo2{


}

class Demochild{

	public static void main(String[] args){

		Demo1 obj = new Demo3();
		obj.m1();
	}
}

