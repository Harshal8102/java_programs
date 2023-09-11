//Methods of NavigableMap

import java.util.*;

class Demo{

	public static void main(String[] args){

		NavigableMap nm = new TreeMap();

		nm.put("Ind","India");
		nm.put("Pak","Pakistan");
		nm.put("Aus","australia");
		nm.put("Ban","bangladesh");
		nm.put("SL","SriLanka");

		System.out.println(nm);

		//Map$Entry<K,V> lowerEntry(K)
		System.out.println(nm.lowerEntry("Pak"));    //return one key-value pair < entered Key
		//K lowerKey(K)
		System.out.println(nm.lowerKey("Pak"));  //return only key

		//Map$Entry<K,V> floorEntry(K)
		System.out.println(nm.floorEntry("Pak"));  // return one key-value pair <= entered key
		//K floorKey(K)
		System.out.println(nm.floorKey("Pak"));  //return only key

		//Map$Entry<K,V> ceilingEntry(K)
		System.out.println(nm.ceilingEntry("Pak")); //return one key-value pair >= entered key
		//K ceilingKey(K)
		System.out.println(nm.ceilingKey("Pak"));    //return only key

		//Map$Entry<K,V> higherEntry(K)
		System.out.println(nm.higherEntry("Pak"));   //return one key-value pair > entered key
		//K higherKey(K)
		System.out.println(nm.higherKey("Pak"));    // return only key

		//Map$Entry<K,V> firstEntry()
		System.out.println(nm.firstEntry());
	     	//Map$Entry<K,V> lastEntry()
		System.out.println(nm.lastEntry());	

		//Map$Entry<K,V> pollFirstEntry()
	/*	System.out.println(nm.pollFirstEntry()); // delete first entry
		//Map$Entry<K,V> pollLastEntry()
		System.out.println(nm.pollLastEntry());   // delete last entry
		System.out.println(nm);
	*/
		//NavigableMap<K,V>  subMap(K,boolean,K,boolean)
		System.out.println(nm.subMap("Aus",false,"Pak",false));  //boolean is taken for to take entered key also
	        
		//NavigableMap<K,V> headMap(K,boolean)
		System.out.println(nm.headMap("Pak",false));    //return < entered key & boolean for take entered key
		
		//NavigableMap<K,V> tailMap(K,boolean)
		System.out.println(nm.tailMap("Pak",true));       //return >= entered key

		//NavigableMap<K,V> descendingMap();
		System.out.println(nm.descendingMap());         //return key-value pair in descending order

		//NavigableSet<K> navigableKeySet()
		System.out.println(nm.navigableKeySet());      //return set of keys

		//NavigableSet<K> descendingKeySet()
		System.out.println(nm.descendingKeySet());       //return set of keys in descending order


	}
}

