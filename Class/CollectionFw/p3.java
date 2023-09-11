//ArrayList methods

import java.util.*;
class ArrayListDemo extends java.util.ArrayList{

	public static void main(String[] args){

		ArrayListDemo al = new ArrayListDemo();

		al.add(10);
		al.add(20.5f);
		al.add("shashi");
		al.add(20.5f);
		al.add(0,"harshal");
		al.add('A');

		System.out.println(al.size());
		System.out.println(al);

		System.out.println(al.contains("shashi"));
		System.out.println(al.contains(30));

		System.out.println(al.indexOf(20.5f));
		System.out.println(al.lastIndexOf(20.5f));

		al.trimToSize();

		al.ensureCapacity(2);

		Object obj = al.clone();                           // make clone of collection
		System.out.println("object " + obj );

		System.out.println(al.get(2));         

		System.out.println(al.set(3,"Incubator"));             //set new object return old object
		System.out.println(al);	

		System.out.println(al.remove("Incubator"));      // if we put object name/value then it return boolean value
		System.out.println(al.remove(2));                // if we put index then it return object name/value 

		ArrayList al2 = new ArrayList();
		al2.add("SKNCOE");
		al2.add("IT");


		al.addAll(al2);
		System.out.println(al);

		al.addAll(1,al2);
		System.out.println(al);
		
		al.removeRange(2,5);
		System.out.println(al);

		Object arr[] = al.toArray();
		for( var x : arr){
			System.out.print(x + "  ");
		}

		System.out.println("skncoe".equals("SKNCOE"));
	}
}

