interface Demo{

	void fun();

	default void gun(){

		System.out.println("in default demo ");
	}

	static void run(){
		System.out.println("in static run demo");
	}
}
class Client implements Demo{

	public void fun(){

	}

	public void gun(){

		System.out.println("in gun client");
	}

	public static void main(String[] args){

		Client obj = new Client();
		obj.gun();
	//	obj.run();  //    error
		Demo.run();
	}
}
