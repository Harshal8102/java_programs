
//IdentityHashMap

import java.util.*;
class IdentityHashCodeDemo{

	public static void main(String[] args){

		IdentityHashMap hm = new IdentityHashMap();

		hm.put(new Integer(10),"kanha");
		hm.put(new Integer(10),"rahul");
		hm.put(10,"badhe");
		hm.put(10,"tejas");

		System.out.println(hm);
	}
}







