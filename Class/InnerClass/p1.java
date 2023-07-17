/* Normal Inner Class*/

class Outer{

	class Inner{

		void fun2(){

			System.out.println("fun-2 inner");
		}
	}

	void fun1(){

		System.out.println("fun1 inner");
	}
}
class Client{

	public static void main(String[] args){

		Outer obj = new Outer();
		obj.fun1();
		Outer.Inner obj1 = obj.new Inner();
		obj1.fun2();

		//OR
		
		Outer.Inner obj2 = new Outer().new Inner();
	}
}

