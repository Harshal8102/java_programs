import java.util.concurrent.*;

class MyThread implements Runnable{

	int num;
	MyThread(int num){

		this.num = num;
	}

	public void run(){

		System.out.println(Thread.currentThread() + " start Thread :" + num);
		dailyTask();
		System.out.println(Thread.currentThread() + " End Thread :" + num);
	}
	void dailyTask(){

		try{
			Thread.sleep(8000);
		}catch(InterruptedException ie){
		}
	}
}
class ThreadPoolDemo{

	public static void main(String[] args){

		ExecutorService es = Executors.newFixedThreadPool(3);

		for(int i=1; i<=6; i++){

			MyThread obj = new MyThread(i);
			es.execute(obj);
		}
			
		es.shutdown();

	}
}
