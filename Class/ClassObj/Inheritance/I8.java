class Sailor{

	private String name;
	private int age;

	public Sailor(String name, int age){
		System.out.println(this.age);

		this.name = name;
		this.age = age;
	}
}
class Engineer extends Sailor{

	private String specialization;

	public Engineer(String name,int age, String specialization){

		super(name,age);
		System.out.println(this.specialization);

		this.specialization = specialization;
		System.out.println(this.specialization);
	}

}
class Client{
	public static void main(String[] args){

		Engineer IT = new Engineer("harshal" , 20 , "IT");
	}
}
