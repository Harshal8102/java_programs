//Iterating over Map

import java.util.*;

class IteratorMapDemo{

	public static void main(String[] args){

		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("Aus","australia");
		sm.put("Ban","bangladesh");
		sm.put("SL","SriLanka");

		System.out.println(sm);

		Set data1 = sm.entrySet();
		Iterator itr = data1.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		Set<Map.Entry> data2 = sm.entrySet();
		Iterator<Map.Entry> itr2 = data2.iterator();

		while(itr2.hasNext()){

			Map.Entry abc = itr2.next();
			if(abc.getKey().equals("Pak")){
				abc.setValue("beta");
			}
			System.out.println(abc.getKey() + " : " + abc.getValue());
		}
	}
}

