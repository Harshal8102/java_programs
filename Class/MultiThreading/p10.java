
class MyThread extends Thread{

	MyThread(String str){

	      	super(str);
	}
	MyThread(){
		super();
	}
	public void run(){

		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}

class ThreadGroupDemo{

	public static void main(String[] args){

		MyThread obj = new MyThread("xyz");
		obj.start();
	
		MyThread obj1 = new MyThread("pqr");
		obj1.start();
	
		MyThread obj2 = new MyThread();
		obj2.start();
	}
}

