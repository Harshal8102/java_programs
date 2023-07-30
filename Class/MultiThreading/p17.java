import java.util.concurrent.*;
class MyThread implements Runnable{

	int num ;

	MyThread(int num){

		this.num = num;
	}

	public void run(){

		System.out.println(Thread.currentThread() + " start Thread : " + num);

		dailyTask();
		
		System.out.println(Thread.currentThread() + " end Thread  : " + num);
	}
	
	void dailyTask(){
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ie){

			System.out.println(ie);
		}
	}
}
class ThreadPoolDemo{

	public static void main(String[] args){

		ThreadPoolExecutor tpe = (ThreadPoolExecutor)Executors.newFixedThreadPool(3);

		for(int i=1; i<=9; i++){

			MyThread obj = new MyThread(i);
			tpe.execute(obj);
		}

		tpe.shutdown();
	}
}

