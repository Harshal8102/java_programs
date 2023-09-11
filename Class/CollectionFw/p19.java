
import java.util.*;
class Movies implements Comparable{

	String movName = null;
	float totColl = 0;

	Movies(String movName, float totColl){
		this.movName = movName;
		this.totColl = totColl;
	}

	public int compareTo(Object obj){

		return movName.compareTo(((Movies)obj).movName);
	
	//	return -(movName.compareTo(((Movies)obj).movName));
	}
	
	public String toString(){

		return movName;
	}
}

class TreeSetDemo{

	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(new Movies("Jailer",250.0f));
		ts.add(new Movies("OMG2",120.0f));
		ts.add(new Movies("Gadar2",150.0f));
	  	ts.add(new Movies("OMG2",120.0f));

		System.out.println(ts);
	}
}
	
