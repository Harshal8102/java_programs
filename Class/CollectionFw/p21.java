import java.util.*;

class Employee{

	String empName = null;
	float sal = 0.0f;

	Employee(String empName, float sal){

		this.empName = empName;
		this.sal = sal;
	}

	public String toString(){

		return "{" + empName + " : " + sal + "}";
	}

}

class SortByName implements java.util.Comparator<Employee>{
	
	public int compare(Employee obj1, Employee obj2){
		return obj1.empName.compareTo(obj2.empName);
	}
}
class SortBySal implements java.util.Comparator<Employee>{

	public int compare(Employee obj1, Employee obj2){

		return (int)(obj1.sal - obj2.sal);
	}
}


class ListSortDemo{

	public static void main(String[] args){

		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee("Kanha",20000.0f));
		al.add(new Employee("Ashish",25000.0f));
		al.add(new Employee("Badhe",15000.0f));
		al.add(new Employee("Rahul",175000.0f));

		System.out.println(al);

		Collections.sort(al,new SortByName());
		System.out.println(al);

		Collections.sort(al,new SortBySal());
		System.out.println(al);
	}
}







		
		

