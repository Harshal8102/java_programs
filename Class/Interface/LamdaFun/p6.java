
//Lamda function with Comparable interface

import java.util.*;
class Employee implements Comparable{

	int empId ;
	String name;

	Employee(int empId,String name){

		this.empId = empId;
		this.name = name;
	}
	

	public String toString(){

		return empId + " : " + name;
	}

	compareTo( ( obj ) -> {

		return empId - ((Employee)obj).empId;
		};
	);

	public static void main(String[] args){

		ArrayList<Employee> al = new ArrayList<>();

		al.add(new Employee(22,"Kanha"));
		al.add(new Employee(15,"Rahul"));
		al.add(new Employee(20,"Ashish"));

		System.out.println(al);

		Collections.sort( al);

	}
}
