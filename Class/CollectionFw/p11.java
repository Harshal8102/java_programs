
import java.util.*;
class HashSetDemo{

	public static void main(String[] args){

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(new Integer(20));
		hs.add(new Integer(10));

		System.out.println(hs);
	}
}
