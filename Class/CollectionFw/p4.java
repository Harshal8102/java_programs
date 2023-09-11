
import java.util.*;

class ArrayListDemo{

	public static void main(String[] args){

		ArrayList obj = new ArrayList();

		obj.add(10);
		obj.add(20.5f);
		obj.add("harshal");
		obj.add(45.55);

		for(var x : obj)
			System.out.println(x);

		for(int i=0; i<obj.size(); i++){

			System.out.println(obj.get(i));
		}
	}
}
