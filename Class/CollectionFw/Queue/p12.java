
//PriorityBlockingQueue using comparable

import java.util.concurrent.*;
import java.util.*;
class Employee{

	String empName ;

	Employee(String empName){

		this.empName = empName;
	}

	public String toString(){

		return empName;
	}
}
class SortByName implements java.util.Comparator{

	public int compare(Object obj1,Object obj2){

		return -(((Employee)obj1).empName.compareTo(((Employee)obj2).empName));
	}
}
class demo{

	public static void main(String[] args){

		PriorityBlockingQueue pbq = new PriorityBlockingQueue(3,new SortByName());

		pbq.offer(new Employee("shashi"));
		pbq.offer(new Employee("kanha"));
		pbq.offer(new Employee("tejas"));
		pbq.offer(new Employee("harshal"));

		System.out.println(pbq);
	}
}
