/* method : public Synchronized StringBuffer delete(int start, int end);
 *
 * parameter : -Integer
 * 	       -Integer
 *
 * ReturnType : StringBuffer*/

class DeleteDemo{

	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("core2web");

		sb.delete(2,7);

		System.out.println(sb);
	}
}

