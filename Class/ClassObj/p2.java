class Macdi{

	int NoOfItem = 5;
	String favItem = "veg";

	void menu(){

		String menu1 = "veg";
		String menu2 = "non-veg";
		System.out.println(System.identityHashCode(NoOfItem));
		System.out.println(System.identityHashCode(menu1));
	}
}
class users{

	public static void main(String[] args){

		Macdi obj = new Macdi();
	       	obj.menu();
		int x = 5;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(obj.favItem));
	}
}	
