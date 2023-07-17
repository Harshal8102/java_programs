
class Core2web{

	public static void main(String[] args){

		StringBuilder var1 = new StringBuilder("Hey");

		StringBuilder var2 = new StringBuilder("Hey");
		System.out.println(var1.hashCode());

		System.out.println(var2.hashCode());

		if(var1.equals(var2))
			System.out.println("Equals");
		else
			System.out.println("Not equals");
	}
}

