class Outer{

	class Inner{

		int a = 30;
	        final static int b = 40;
	}
}
class Client{

	public static void main (String[] args){
		
	//	Outer obj = new Outer();

	//	System.out.println(obj.new Inner().b);
	
		System.out.println(Outer.Inner.b);
	}
}

