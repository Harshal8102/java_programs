
import java.util.*;
class StrDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add("kanha");
		al.add("badhe");
		al.add("shashi");
		al.add("rahul");

		System.out.println(al);
		
		Collections.sort(al);                //sort() method in collections class

		System.out.println(al);
	}
}

