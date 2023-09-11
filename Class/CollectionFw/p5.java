import java.util.*;
class CricPlayer{

	int jerno = 0;
	String name = null;

	CricPlayer(int jerno,String name){

		this.jerno = jerno;
		this.name = name;
	}

	public String toString(){

		return jerno + " : " + name;
	}

}
class ArrayListDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(new CricPlayer(18,"virat"));
		al.add(new CricPlayer(7,"MSD"));
		al.add(new CricPlayer(45,"Rohit"));

		System.out.println(al);

		al.add(1,new CricPlayer(33,"hardik"));

		System.out.println(al);
	}
}

