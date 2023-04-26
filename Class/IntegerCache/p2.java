class demo{

	public static void main(String[] args){

		int x = 12;
		int y = 12;
		Integer z = 12;

		System.out.println(System.identityHashCode(x)); 
		System.out.println(System.identityHashCode(y)); 
		System.out.println(System.identityHashCode(z));
	}
}	



