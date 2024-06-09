class MyThread extends Thread{
	static Thread nmMain = null;
	public void run(){
		try{
			nmMain.join();
		}catch(InterruptedException obj){
		}
		for(int i=0; i<10; i++){
			System.out.println("In Thread0");
		}
	}
}
class Threaddemo{
	public static void main(String[] args)throws InterruptedException{

		MyThread.nmMain = Thread.currentThread();

		MyThread obj = new MyThread();
		obj.start();
		obj.join(2000,100);
		obj.join(2000);
//obj.join();

		for(int i=0; i<10; i++){
			System.out.println("In main");
		}
	}
}
