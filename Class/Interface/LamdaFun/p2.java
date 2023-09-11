//ways of lamda function

interface Core2web{

	void lang();
}

interface Company{

	void name(String name);
}

class demo{

	public static void main(String[] args){

		Core2web c2w = ()-> System.out.println("java/os/c-cpp");
		c2w.lang();


		Company c1 = (String name)-> System.out.println(name);
		c1.name("Veritas");

		Company c2 = (name)-> System.out.println(name);
		c2.name("EQTech");

		Company c3 = name -> System.out.println(name);
		c3.name("nvdia");

		Company c4 = nm -> {

			System.out.println(nm);
		};
		c4.name("Barclays");
	}
}
