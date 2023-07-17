/* method : public String[] split(String delimeter);
 * description : Splits this String around matches of regular expressions
 * parameter : delimeter(patter to match)
 * return type : String[] (array of split Strings)
 * */

class MySplits{

	public static void main(String[] args){

		String str = "know the code till the core";

		String [] strResult = str.split(" ");

		for(int i=0; i<strResult.length; i++)
			System.out.println(strResult[i]);
	}
}

