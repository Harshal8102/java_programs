class StringBufferDemo{

	public static void main(String [] args){

		StringBuffer str = new StringBuffer("Shashi");

		System.out.println(System.identityHashCode(str));

		str.append("Bagal");

		System.out.println(str);

		System.out.println(System.identityHashCode(str));
	}
}

