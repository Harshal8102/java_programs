class demo{

	public static void main(String[] args){

		int x = 65;
		int y = 65;
		char ch = 'A';
		String s1 = "harshal";
		String s2 = "harshal";

		System.out.println(System.identityHashCode(x));

		System.out.println(System.identityHashCode(y));

		System.out.println(System.identityHashCode(ch));
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));


	}
}


