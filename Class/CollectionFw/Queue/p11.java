
//PriorityBlockingQueue using comparator

import java.util.concurrent.*;
class Employee implements Comparable{

	String empName ;

	Employee(String empName){

		this.empName = empName;
	}

	public int compareTo(Object obj){

		return empName.compareTo(((Employee)obj).empName);
	}

	public String toString(){

		return empName;
	}
}
class demo{

	public static void main(String[] args){

		PriorityBlockingQueue pbq = new PriorityBlockingQueue(3);

		pbq.offer(new Employee("shashi"));
		pbq.offer(new Employee("kanha"));
		pbq.offer(new Employee("tejas"));
		pbq.offer(new Employee("harshal"));

		System.out.println(pbq);
	}
}

