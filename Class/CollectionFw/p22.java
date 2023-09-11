import java.util.*;
class Movies{

	String movName = null;
	double totColl = 0.0;
	float rate = 0.0f;

	Movies(String movName , double totColl , float rate){

		this.movName = movName;
		this.totColl = totColl;
		this.rate = rate;
	}

	public String toString(){

		return "{" + movName + " : " + totColl + " : " + rate + "}";
	}

}
class SortByName implements Comparator{

	public int compare(Object obj1, Object obj2){

		return ((Movies)obj1).movName.compareTo(((Movies)obj2).movName);
	}
}

class SortByColl implements Comparator{

	public int compare(Object obj1,Object obj2){

		return  (int)((((Movies)obj1).totColl) - (((Movies)obj2).totColl));
	}
}
class SortByRate implements Comparator{

	public int compare(Object obj1,Object obj2){

		return (int)((((Movies)obj1).rate) - (((Movies)obj2).rate));
	}
}
class ListSortDemo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(new Movies("Ved" , 2000000.0 , 8.5f));
		al.add(new Movies("RHTDM" , 1750000.0 , 9f));
		al.add(new Movies("3idiots" , 2500000.0 , 9.5f));
		al.add(new Movies("BajrangiBhaijann" , 1500000.0 , 8f));

		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		Collections.sort(al,new SortByColl());
		System.out.println(al);

		Collections.sort(al,new SortByRate());
		System.out.println(al);
	}
}

