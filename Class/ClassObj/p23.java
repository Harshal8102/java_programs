class Player{

	private int jerNo = 0;
	private String name = null;

	Player(int no,String nam){
	
		this.jerNo = no;
		this.name = nam;
		System.out.println("In constructor");
	}

	void info(){

		System.out.println(jerNo + " = " + name);
		System.out.println(System.identityHashCode(name));
	
	}
}

class Client{
	
	public static void main(String[] args){

		String name = "MSD";
		System.out.println(System.identityHashCode(name));

		Player obj1 = new Player(7,"MSD");
		obj1.info();

		/*Player obj2 = new Player(18,"Virat");
		obj2.info();

		Player obj3 = new Player(45,"Rohit");
		obj3.info();*/
	}
}
