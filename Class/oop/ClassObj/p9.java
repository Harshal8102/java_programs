class Employee{

	int empId = 10;
	String str = "kanha";

	static int y = 50;

	void empInfo(){

		System.out.println("empId = " + empId);
		System.out.println("name = " + str);
		System.out.println(" y = " + y);
	}

	public static void main(String[] args){

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.empInfo();
		emp2.empInfo();

		emp2.empId = 20;
		emp2.str = "shashi";
		emp2.y = 5000;
		System.out.println("--------After changing---------");

		emp1.empInfo();
		emp2.empInfo();
	}
}
