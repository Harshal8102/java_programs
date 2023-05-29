public class  Core2web{

	int numCourse = 8;
        String favcourse = "Java";

	void display(){

		System.out.println(numCourse);
		System.out.println(favcourse);
	}

}

class Student{

	public static void main(String[] args){

		Core2web obj = new Core2web();
		obj.display();

		System.out.println(obj.numCourse);
		System.out.println(obj.favcourse);
	}
}

