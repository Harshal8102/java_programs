class Core2web{

	int NoOfCourse = 8;
	String FavCourse = "Java & Operating System";

	void display(){

		System.out.println(NoOfCourse);
		System.out.println(FavCourse);
	}
}
class Student{

	public static void main(String[] args){

		Core2web obj = new Core2web();

		obj.display();
	}
}
