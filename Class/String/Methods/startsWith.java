/* method: public boolean startsWith(String prefix, int toffset);
 * description :- predicate which determines if the given string contains the given beggining comparison of toffset
 *              - The result is false if the toffset is negative or greater than str.length().
 * parameters : - prefix String to compare, 
 *              - toffset offset for this String where the comparision starts
 * return type : boolean */

class StartsWith{

	public static void main(String[] args){

		String str = "Core2web";
		System.out.println(str.startsWith("2w",0));
	}
}

