class Stringdemo{

	public static void main(String[] args){

		String str1 = "Harshal";
		String str2 = new String("Harshal");
		String str3 = "Shashi";
		String str4 = new String("Shashi");

		System.out.println(str1.hashCode());  //1000
		System.out.println(str2.hashCode());  //1000
		System.out.println(str3.hashCode());  //2000
		System.out.println(str4.hashCode());  //2000
	}
}

