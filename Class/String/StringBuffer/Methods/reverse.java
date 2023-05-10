/* method : public synchronized StrinBuffer reverse();
 *
 * description : -reverse the characters in StringBuffer
 *  		 -The same sequence of character exists, but in the reverse index ordering 
 *
 * parameter : no parameter
 * return type : StringBuffer */

class ReverseDemo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("Shashi");
		System.out.println(System.identityHashCode(sb));

		System.out.println(sb.reverse());
		System.out.println(System.identityHashCode(sb));

		String str = "core2web";

		StringBuffer sb2 = new StringBuffer(str);

		str = sb2.reverse().toString();  //method cheving
		System.out.println(str);


	}
}


