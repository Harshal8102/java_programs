//Methods of SortedMap

import java.util.*;

class Demo{

	public static void main(String[] args){

		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("Aus","australia");
		sm.put("Ban","bangladesh");
		sm.put("SL","SriLanka");

		System.out.println(sm);

		//subMap(K,K)
		System.out.println(sm.subMap("Aus","Pak"));

		//headMap(K)
		System.out.println(sm.headMap("Pak"));       // return key-values less than entered key

		//tailMap(K)
		System.out.println(sm.tailMap("Ind"));        //return >= key-value pair than entered key

		//K firstKey()
		System.out.println(sm.firstKey());

		//K lastKey()
		System.out.println(sm.lastKey());

		//Set keySet()
		System.out.println(sm.keySet());           //return set of keys

		//Collection values()
		System.out.println(sm.values());            //return collection of values

		//Map&entry entrySet()
		System.out.println(sm.entrySet());      //return set of key-values for itration 

	}
}

