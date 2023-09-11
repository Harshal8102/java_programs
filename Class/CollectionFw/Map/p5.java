//Methods of HashMap

import java.util.*;
class demo{

	public static void main(String[] args){

		HashMap mp = new HashMap();

		//put()
		mp.put("India","Modi");
		mp.put("USA" , "Joe biden");
		mp.put("Russia","Putin");
		mp.put("Pakistan","Ul hak qakar");

		System.out.println(mp);

		//get()
		System.out.println(mp.get("India"));

		//keySet()
		System.out.println(mp.keySet());

		//values()
		System.out.println(mp.values());

		//entrySet()
		System.out.println(mp.entrySet());
	}
}

