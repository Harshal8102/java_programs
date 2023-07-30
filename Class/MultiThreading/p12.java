class MyThread extends Thread{

	MyThread(ThreadGroup tg,String str){

		super(tg,str);
	}

	public void run(){

		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo{

	public static void main(String[] args){

		ThreadGroup pthreadGP = new ThreadGroup("core2web");

		MyThread obj1 = new MyThread(pthreadGP,"c");
		MyThread obj2 = new MyThread(pthreadGP,"java");
		MyThread obj3 = new MyThread(pthreadGP,"cpp");

		obj1.start();
		obj2.start();
		obj3.start();

		//Child ThreadGroup creation

		ThreadGroup cthreadGP = new ThreadGroup(pthreadGP,"Incubator");
		
		MyThread obj4 = new MyThread(cthreadGP,"Flutter");
		MyThread obj5 = new MyThread(cthreadGP,"SpringBoot");
		MyThread obj6 = new MyThread(cthreadGP,"React");

		obj4.start();
		obj5.start();
		obj6.start();

	}
}
