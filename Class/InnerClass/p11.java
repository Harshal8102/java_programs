//Static Inner Class


class Outer{

	 static class Inner{


		static void m1(){

			System.out.println("In m1-Inner");
		}

		static int a=10;
	
	}
}
class Client{

	public static void main(String[] args){

		Outer.Inner obj1 = new Outer.Inner();
		obj1.m1();

		System.out.println(Outer.Inner.a);

	}
}

