class SBDemo{

	public static void main(String[] args){

		String str1 = "shashi";
		String str2 = new String("bagal");
		StringBuffer str3 = new StringBuffer("core2web");
		
		System.out.println("Str3 = " + System.identityHashCode(str3));
	

		String str4 = str1.concat(str2);
		StringBuffer str5 = str3.append(str2);

		System.out.println("Str5 = " + System.identityHashCode(str5));
	

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}
}

	
	
	
	
