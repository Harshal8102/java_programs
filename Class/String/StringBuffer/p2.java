class StringBufferDemo{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer();

		System.out.println(str1.capacity());
		
		System.out.println(System.identityHashCode(str1));
		

		str1.append("djcjwdcwd cwcwdcw iucbwbdcbw");

		System.out.println(str1.capacity());
		System.out.println(System.identityHashCode(str1));

		str1.append("hwbshuqwvxuhqwvxuvqwuvqxuhvqwx");

		System.out.println(str1.capacity());
		System.out.println(System.identityHashCode(str1));
		
		str1.append("hwbshuqwvxuhqwvxuvqwuvqxuhvqwx");
		
		System.out.println(str1.capacity());
		System.out.println(System.identityHashCode(str1));
		
	}
}

