//Dictionary methods
import java.util.*;
class DictionaryDemo{

	public static void main(String[] args){

		Dictionary d = new Hashtable();

		d.put(10,"Sachin");
		d.put(7,"MSD");
		d.put(18,"Virat");
		d.put(45,"Rohit");       //V put(K,V)
		d.put(1,"KLRahul");

		System.out.println(d);

		//Enumeration<K> keys()
		Enumeration itr1 = d.keys();
		while(itr1.hasMoreElements()){
			System.out.print(itr1.nextElement() + "   ");
		}
		System.out.println();
		//Enumeration<V> elements()
		Enumeration itr2 = d.elements();
		while(itr2.hasMoreElements()){
			System.out.print(itr2.nextElement() + "   ");
		}
		System.out.println();

		//V get(Object)
		System.out.println(d.get(10));

		//V remove(Object)
		System.out.println(d.remove(1));

		System.out.println(d);

		System.out.println(d.isEmpty());     // boolean isEmpty()

		System.out.println(d.size());     //int size()

	}
}
