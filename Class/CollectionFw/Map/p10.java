
//treemap using comparable

import java.util.*;
class Platform implements Comparable{

	String compName = null;
	int foundYear = 0;

	Platform (String compName,int foundYear){

		this.compName = compName;
		this.foundYear = foundYear;
	}

	public String toString(){

		return "{" + compName + " : " + foundYear + "}";
	}

	public int compareTo(Object obj){

		return foundYear - ((Platform)obj).foundYear;
	}
}
class TreeMapDemo{

	public static void main(String[] args){

		TreeMap tm = new TreeMap();

		tm.put(new Platform("Instagram",2010),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("ChatGpt",2022),"OpenAI");

		System.out.println(tm);
	}
}

