
//WeekHashMap
import java.util.*;
class Demo{

	String str ;

	Demo(String str){

		this.str = str;
	}

	public String toString(){

		return str;
	}

	public void finalize(){

		System.out.println("notify");
	}
}

class GCDemo{

	public static void main(String[] args){

		Demo obj1 = new Demo("Core2web");
		Demo obj2 = new Demo("Incubator");
		Demo obj3 = new Demo("Biencaps");

		WeakHashMap hm = new WeakHashMap();

		hm.put(obj1,2017);
		hm.put(obj2,2023);
		hm.put(obj3,2019);

		System.out.println(hm);
		obj1 = null;
		obj2 = null;
		System.gc();
		System.out.println(hm);

	}
}

