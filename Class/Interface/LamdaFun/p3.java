
//lamda function with parameter

interface Core2web{

	String lang(int numCourse,String course);
}
class Year2022{

	public static void main(String[] args){

		Core2web c2w =  (x , y)-> y  + " : " + x;
		
		System.out.println(c2w.lang(8,"java"));


		Core2web c2w1 = (x,y)->{
			return x + " : " + y;
		};

		System.out.println(c2w1.lang(2,"c-cpp"));
	}
}
