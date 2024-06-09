interface demo{


	default int fun(){

		return 10;
	}
}
class demo2 implements demo{

	public int fun(){

		return 0;
	}
	
	public static void main(String[] args){

		demo o = new demo2();
		System.out.println(o.fun());
	}
}
