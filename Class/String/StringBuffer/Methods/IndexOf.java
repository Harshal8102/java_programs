/* method: public Synchronized int indexOf(String str, int formIndex)
 * description:
 * 	-Finds the first instance of a String in this StringBuffer, Starting at a given index.
 * 	-If the starting index is less than 0, the search starts at the beginning of this String.
 * 	-If the starting index is greater than the length of this string, or the substring is not found, -1 is returned
 * 	parameters:
 * 		-String(str String to find),
 * 		-Integer(formIndex index to start the search).
 * 	Return type: Integer(location (base 0) of the String, or -1 if not found).
 * */

class MyIndexOf{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("core2web");
		System.out.println(str1.indexOf("r",0));
	}
}
