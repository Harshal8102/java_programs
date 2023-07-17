class Outer{

	int x = 10;
	static int y = 20;

	class Inner{

		void fun2(){

			System.out.println("fun2 inner");
			System.out.println(x);
			System.out.println(y);
		}
	}

	void fun2(){
		
		System.out.println("fun1 outer");
		System.out.println(x);
		System.out.println(y);
	}
}
class Client{

	public static void main(String[] args){

		Outer obj = new Outer();
		obj.fun2();

		Outer.Inner obj1 = obj.new Inner();
		obj1.fun2();
	}
}

