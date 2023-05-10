/* method : public Synchronized StringBuffer insert(int offset, String str);
 *
 * parameter : -Integer(offset the place to insert in this buffer)
 *             -String(String which to insert in that place)
 *
 * Return type : StringBuffer */

class InsertDemo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("shashi Core2web");

		System.out.println(sb);

		sb.insert(6,"Bagal");

		System.out.println(sb);
	}
}
