/*StringBuffer 
 * method : capacity() */

class StringBufferDemo{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("Harshal");

		System.out.println(str1.capacity()); //7+16 = 23
		
		System.out.println(System.identityHashCode(str1));  //100
		

		str1.append("djcjwdcwd cwcwdcw iucbwbdcbw");

		System.out.println(str1.capacity());      //23+1 * 2 = 48
		System.out.println(System.identityHashCode(str1));  //100

		str1.append("hwbshuqwvxuhqwvxuvqwuvqxuhvqwx");

		System.out.println(str1.capacity());       //48+1 *2 = 98
		System.out.println(System.identityHashCode(str1));   //100
	}
}

