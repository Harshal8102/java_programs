//Static Inner Class

class Outer{

	 static class Inner{


		static void m1(){

			System.out.println("In m1-Inner");
		}

		static int a=10;

		void m2(){	
			System.out.println("in m2 inner");
		}
	}
}
class Client{

	public static void main(String[] args){

		Outer.Inner obj1 = new Outer.Inner();
		obj1.m1();
		obj1.m2();

		System.out.println(Outer.Inner.a);

	}
}

