class MyThread extends Thread{

	static Thread myTh = null;
	public void run(){

		myTh.yield();
		System.out.println(Thread.currentThread().getName());
		for(int i=0 ; i<10; i++){
			System.out.println("in Thread0");
		}
	}
}
class Threaddemo{

	public static void main(String[] args){

		MyThread.myTh = Thread.currentThread();

		MyThread obj = new MyThread();
		obj.start();
	
		obj.yield();

		for(int i=0 ; i<10; i++){
			System.out.println("in main");
		}

		System.out.println(Thread.currentThread().getName());
	}
}

