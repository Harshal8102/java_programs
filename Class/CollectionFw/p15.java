
import java.util.*;

class MyClass extends Thread implements java.lang.Comparable{

	String str = null;

	MyClass(String str){

		this.str = str;
	}

	public int compareTo(Object obj){
		
	//	String s = obj.toString();
	//	return str.compareTo(s);

		return str.compareTo(((MyClass)obj).str);
	}

	public String toString(){

		return str;
	}
}

class TreeSetDemo{

	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(new MyClass("Kanha"));
		ts.add(new MyClass("Ashish"));
		ts.add(new MyClass("Rahul"));
		ts.add(new MyClass("Badhe"));
		ts.add(new MyClass("Kanha"));
		ts.add(new MyClass("Ashish"));

		System.out.println(ts);	
	}
}
