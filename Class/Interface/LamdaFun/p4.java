
//Runnable interface with lamda function

class ThreadDemo{

	public static void main(String[] args){

		//Anonymous inner class
		Runnable obj1 = new Runnable(){

			public void run(){

				System.out.println("In anonymous inner class " + Thread.currentThread().getName());
			}
		};

		Thread t1 = new Thread(obj1);
		t1.start();
		obj1.run();

		//Lamda function
		Runnable obj2 = ()->{

			System.out.println("In lamda function " + Thread.currentThread().getName());
		};

		Thread t2 = new Thread(obj2);
		t2.start();
		obj2.run();
	}
}
