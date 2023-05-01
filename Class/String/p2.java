class Stringdemo{

	public static void main(String[] args){

		String str1 = "core2web"; 
		String str2 = new String("core2web");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3 = "core2web";
		String str4 = new String("core2web");
		

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}






