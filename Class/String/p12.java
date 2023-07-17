class demo{

	public static void main(String[] args){

		int x = 65;
		int y = 65;
		char ch = 'A';

		System.out.println(System.identityHashCode(x));

		System.out.println(System.identityHashCode(y));

		System.out.println(System.identityHashCode(ch));
	}
}


