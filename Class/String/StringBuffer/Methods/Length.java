/* method public Synchronized int length();
 * description : 
 * 	-Get the length of the <code>String</code> this <code>StringBuffer</code> would create.
 * 	-Not to be confused with the <em>capacity</em> of the <code>StringBuffer</code>.
 * 	parameter : No Parameter
 * 	Return type : Integer
 * */

class MyLength{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("core2web");
	
		System.out.println(str1.length());
	}
}

