class Player{

	private int jerNo ;
	private String name=null;

	Player(int no,String name){
	
		this.jerNo = no;
		this.name = name;
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

		String nam = "Virat";
		System.out.println(System.identityHashCode(nam));

		Player obj2 = new Player(18,new String("Virat"));
		obj2.info();

		Player obj3 = new Player(45,"Rohit");
		obj3.info();
	}
}
