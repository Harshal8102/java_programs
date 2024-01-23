
//real time example of abstraction

abstract class BCCI{

	int x = 0;
	static int y;
	abstract void rules();
}
class IPL extends BCCI{

	void rules(){

		System.out.println("impact player");
	}
}
class Client{

	public static void main(String[] args){

		IPL obj = new IPL();
		obj.rules();
	}
}
