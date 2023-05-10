class SBDemo{

	public static void main(String[] args){

		String str1 = "shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("core2web");	
	
		System.out.println("Str3 = " + System.identityHashCode(str3));
	
		StringBuffer str4 = str3.append(str1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("Str3 = " + System.identityHashCode(str3));
		System.out.println(str4);
		System.out.println("str4 = " + System.identityHashCode(str4));

	}
}
