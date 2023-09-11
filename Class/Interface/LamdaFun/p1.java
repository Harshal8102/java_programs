//Lamda Expression/function

interface Core2web{

	void lang();
}
class demo{

	public static void main(String[] args){

		Core2web c2w = new Core2web(){             //Anonymous inner class

			public void lang(){

				System.out.println("BootCamp/java/python/os");
			}
		};
		c2w.lang();


		Core2web c2w1 = ()->{           // lamda function = only works on functional interface

			System.out.println("Java/os");
		};
		c2w1.lang();
	}
}
