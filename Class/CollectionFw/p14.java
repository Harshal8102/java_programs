//TreeSet

import java.util.*;
class TreeSetDemo{

	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(new StringBuffer("Rahul"));
		ts.add(new StringBuffer("Badhe"));
		ts.add(new StringBuffer("Ashish"));
		ts.add(new String("Ashish"));

		System.out.println(ts);	
	}
}
