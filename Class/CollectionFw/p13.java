
import java.util.*;

class CricPlayer implements java.lang.Comparable{

	int jerno = 0;
	String pname = null;

	CricPlayer(int jerno,String pname){

		this.jerno = jerno;
		this.pname = pname;
	}

	public int compareTo(Object obj){

	//	String s = obj.toString();
	//	return this.pname.equals(s);
		return 0;	
	}

	public String toString(){

		return jerno + " : " + pname;
	}

}
class LinkedHashSetDemo{

	public static void main(String[] args){

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add(new CricPlayer(18,"virat"));
		lhs.add(new CricPlayer(7,"MSD"));
		lhs.add(new CricPlayer(45,"Rohit"));
		lhs.add(new CricPlayer(45,"Rohit"));

		System.out.println(lhs);
	}
}

