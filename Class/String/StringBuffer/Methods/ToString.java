/* method : public String toString();
 * description : 
 * 		-convert this <code>StringBuffer</code> to a <code>String</code>.
 * 		-The String is composed of the characters currently in this StringBuffer.
 * 		-Note that the result is a copy, and that future modifications to this buffer do not affect the String.
 * 		parameters :No Parameters
 * 		Return Type : String (the Characters in this StringBuffer
 * */

class MyToString{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("know the code till the core");
		String str2 = "core2web";
		String str3 = str1.toString();
		String str4 = str2.concat(str3);
		System.out.println(str4);

	}
}



