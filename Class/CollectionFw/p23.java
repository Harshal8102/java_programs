import java.util.*;
class Placement{

	String compName = null;
	long pack = 0;

	Placement(String compName, long pack){

		this.compName = compName;
		this.pack = pack;
	}

	public String toString(){

		return "{" + compName + " : " + pack + "}";
	}
}

class SortByName implements Comparator{

	public int compare(Object o1,Object o2){

		return ((Placement)o1).compName.compareTo(((Placement)o2).compName);
	}
}
class SortByPack implements Comparator{

	public int compare(Object o1,Object o2){

		return (int)((((Placement)o1).pack) - (((Placement)o2).pack));
	}
}
class Candidate{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(new Placement("EQTech",1300000));
		al.add(new Placement("PTC",1000000));
		al.add(new Placement("Barclays",1000000));
		al.add(new Placement("Veritas",800000));
		al.add(new Placement("PTC",900000));

		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		Collections.sort(al,new SortByPack());
		System.out.println(al);
	}
}


