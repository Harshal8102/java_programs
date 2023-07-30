class MyThread extends Thread{

	public void run(){

		System.out.println(Thread.currentThread());
	}
}

class Threaddemo{
	public static void main(String[] args)throws InterruptedException{

		System.out.println(Thread.currentThread());

		MyThread obj = new MyThread();
		obj.start();

		Thread.sleep(1000,10);

		Thread.currentThread().setName("harshal");
		System.out.println(Thread.currentThread());
	}
}

