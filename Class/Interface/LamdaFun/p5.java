//Lamda function with Comparator interface
//

import java.util.*;
class Employee{

	int empId ;
	String name;

	Employee(int empId,String name){

		this.empId = empId;
		this.name = name;
	}

	public String toString(){

		return empId + " : " + name;
	}
}
class Demo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(new Employee(22,"Kanha"));
		al.add(new Employee(15,"Rahul"));
		al.add(new Employee(20,"Ashish"));

		System.out.println(al);

		Collections.sort(al, (Object obj1,Object obj2)->{

				return ((Employee)obj1).name.compareTo(((Employee)obj2).name);
			}
		);
		System.out.println(al);

		Collections.sort(al,(obj1,obj2)->{
  
				return (((Employee)obj1).empId) - (((Employee)obj2).empId);
			}
		);
		System.out.println(al);
	}
}
