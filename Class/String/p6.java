class Stringdemo{

	public static void main(String[] args){

		String str1 = "shashi";
		String str2 = "bagal";

		System.out.println(str1 + str2);

		String str3 = "shashibagal";
		String str4 = str1 + str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}



