/* method : public synchronized int lastIndexOf(String str,int formIndex);
 * description :
 * 	-Finds the last instance of a String int this StringBuffer, starting at a given index,
 * 	-If starting index is greater than the maximum valid index, then the search begins at the end of this String.
 * 	-If the starting index is less than zero, or the substring is not found, -1 is returned.
 * 	parameters : -String(str string to find),
 * 		     -Integer(formIndex index to start the search).
 * 	Return type: - Integer(location(base 0) of the String , or -1 if not found).
 *
 * 	searching technique is from right to left
 */

class MyLastIndexOf{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("core2web");
		System.out.println(str1.lastIndexOf("e",4));
	}
}


