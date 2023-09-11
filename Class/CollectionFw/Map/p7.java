//WeekHashMap
//working of Garbage Collection

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

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1 = null;
		obj2 = null;

		System.gc();

		System.out.println("In main");
	}
}

