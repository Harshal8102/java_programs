/* method : public synchronized String substring(int beginIndex, int endIndex);
 * description: 
 * 	-Creates a substring of this StringBuffer, starting at a specified index and ending at one character before a specified index.
 *
 * 	parameters:
 * 		-Integer(beginIndex index to start at(inclusive, base 0)),
 * 		-Integer(endIndex index to end at (exclusive)),
 * 		-String(str the new <code>String</code> to insert).
 * 	Return type:
 * 		String(new String which is a substring of this StringBuffer).
 */

class Mysubstring{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("know the code till the core");
	
		String str2 = str1.substring(14,22);

		System.out.println(str2);
	
	}
}

