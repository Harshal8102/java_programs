//PriorityQueue using comparator
import java.util.*;
class Project {

	String projName = null;
	int teamSize = 0;
	int duration = 0;

	Project(String projName, int teamSize, int duratrion){

		this.projName = projName;
		this.teamSize = teamSize;
		this.duration = duration;
	}

	public String toString(){

		return "{" + projName + " : " + teamSize + " : " + duration + "}";
	}
}
class SortByTeamSize implements Comparator{

	public int compare(Object obj1, Object obj2){

		return (((Project)obj1).teamSize)-(((Project)obj2).teamSize);
	}
}
class Client{

	public static void main(String[] args){

		PriorityQueue pq = new PriorityQueue(new SortByTeamSize());

		pq.offer(new Project("Zcc",200,10));
		pq.offer(new Project("Hcb",500,30));
		pq.offer(new Project("Kar",300,45));
		pq.offer(new Project("Oat",450,20));

		System.out.println(pq);
	}
}
