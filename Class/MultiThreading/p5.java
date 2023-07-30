class MyThread extends Thread{

	public void run(){

		Thread t = Thread.currentThread();
		System.out.println("MyThread : " + t);
		System.out.println("MyThread : " + t.getPriority());
	}
}
class Threaddemo{

	public static void main(String[] args){

		Thread t = Thread.currentThread();
		System.out.println("Threaddemo : " + t);
		System.out.println("Threaddemo : " + t.getPriority());

		MyThread obj = new MyThread();
		obj.start();

		t.setPriority(10);               // 0 < priority <= 10

		MyThread obj2 = new MyThread();
		obj2.start();

		//obj2.start();                 IllegalThreadStateException

	}
}

