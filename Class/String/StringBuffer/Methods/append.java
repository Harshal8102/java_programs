/*StringBuffer append() method
 * method : public synchronized StringBuffer append(String str);
 * parameter = String/StringBuffer(str the <code>String</code> append)
 * Return type = StringBuffer(this <code>StringBuffer</code>);
 */

class AppendDemo{

	public static void main(String[] args){

		StringBuffer str1 = new StringBuffer("Harshal");
	
		System.out.println(str1);

		str1.append(" Mohite");

		System.out.println(str1);

	}
}
