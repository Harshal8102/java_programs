class MyThread extends Thread{

	MyThread(ThreadGroup tg, String str){
		super(tg,str);
	}
	public void run(){

		System.out.println(Thread.currentThread());
	}
}
class Threaddemo{

	public static void main(String[] args){

		ThreadGroup pThreadGP = new ThreadGroup("India");

		MyThread t1 = new MyThread(pThreadGP,"Maharashtra");
		MyThread t2 = new MyThread(pThreadGP,"Goa");

		t1.start();
		t2.start();


		ThreadGroup cThreadGP = new ThreadGroup(pThreadGP,"pakistan");
		
		MyThread t3 = new MyThread(cThreadGP,"lahore");
		MyThread t4 = new MyThread(cThreadGP,"karachi");

		t3.start();
		t4.start();

		System.out.println(Thread.currentThread().getThreadGroup().getParent());
	
		System.out.println(pThreadGP.getParent());
	
		System.out.println(cThreadGP.getParent());
	}
}
