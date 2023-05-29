class Employee{

	int empId = 10;
	String str = "shashi";

	void empInfo(){

		System.out.println("Id = " + empId);
		System.out.println("Name = " + str);
	}
}

class mainDemo{

	public static void main(String[] args){

		Employee emp1 = new Employee();
		emp1.empInfo();

		System.out.println(emp1.empId);
		System.out.println(emp1.str);
	}
}
