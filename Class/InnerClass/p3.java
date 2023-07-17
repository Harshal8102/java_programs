
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

		Outer obj = new Outer();  // Outer(obj)
		
		Outer.Inner obj1 = obj.new Inner();  // Outer$Inner(obj1, obj)
		obj1.fun2();


		Outer.Inner obj2 = obj.new Inner();  // Outer$Inner(obj2, obj)
		obj2.fun2();

	}
}

