
import java.util.*;
class Project implements Comparable{

	String projName = null;
	int teamSize = 0;
	int duration = 0;

	Project(String projName, int teamSize, int duratrion){

		this.projName = projName;
		this.teamSize = teamSize;
		this.duration = duration;
	}

	public int compareTo(Object obj){

		return projName.compareTo(((Project)obj).projName);
	}
	public String toString(){

		return "{" + projName + " : " + teamSize + " : " + duration + "}";
	}
}
class Client{

	public static void main(String[] args){

		PriorityQueue pq = new PriorityQueue();

		pq.offer(new Project("Acc",200,10));
		pq.offer(new Project("Fcb",500,30));
		pq.offer(new Project("Car",300,45));
		pq.offer(new Project("Bat",450,20));

		System.out.println(pq);
	}
}
