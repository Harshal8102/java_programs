class MyThread implements Runnable{
	
	public void run(){

		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	}
}
class Threaddemo{

	public static void main(String[] args){

		MyThread obj = new MyThread();
		Thread t = new Thread(obj);             //creation of thread

		t.start();

		System.out.println(Thread.currentThread().getName());
	}
}

