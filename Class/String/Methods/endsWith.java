/* method : public boolean endsWith(String suffix);
 *description : - predicate which determines if the String ends with given suffix
                - if the suffix is an empty String, true is returned
		- throws NullPointerException if suffix is null
  Parameter : prifix String to compare
  return type : boolean */

class EndsWith{

	public static void main(String[] args){

		String str1 = "know the code till the core";
		System.out.println(str1.endsWith("core"));
	}
}

