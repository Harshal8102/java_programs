class c2w{

	public static void main(String[] args){

		String var1 = "core2web";
		String var2 = "core2webtechnologies";

		if(var1 == var1.concat(var2))
			System.out.println("Hey");
		else if(var2 == var1.concat(var2))
			System.out.println("Hii");
		else
			System.out.println("bye");
	
	}
}

// == internaly checks the identityHashCode
