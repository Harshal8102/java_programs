
//treemap using comparator

import java.util.*;
class Platform{

	String compName = null;
	int foundYear = 0;

	Platform (String compName,int foundYear){

		this.compName = compName;
		this.foundYear = foundYear;
	}

	public String toString(){

		return "{" + compName + " : " + foundYear + "}";
	}
}

class SortByName implements java.util.Comparator{

	public int compare(Object obj1, Object obj2){

		return ((Platform)obj1).compName.compareTo(((Platform)obj2).compName);
	}
}

class SortByYear implements java.util.Comparator{

	public int compare(Object obj1, Object obj2){

		return ((Platform)obj1).foundYear - ((Platform)obj2).foundYear;
	}
}

class TreeMapDemo{

	public static void main(String[] args){

		TreeMap tm = new TreeMap(new SortByYear());

		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("ChatGpt",2022),"OpenAI");

		System.out.println(tm);
	}
}

