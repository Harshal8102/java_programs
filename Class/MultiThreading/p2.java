
class MyThread extends Thread{

	public void run(){

		System.out.println(" In MyThread class Thread is : " + Thread.currentThread().getName());
	
		for(int i=0; i<10; i++){

			System.out.println("In run");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException obj){

			}
		}
		gun();
	}

	void gun(){

		System.out.println("...........In gun.........");
	}
}

class Threaddemo{

	public static void main(String[] args)throws InterruptedException{

		MyThread obj = new MyThread();
		obj.start();

		System.out.println(" In Threaddemo Thread is : " + Thread.currentThread().getName());
	
		for(int i=0; i<10; i++){

			System.out.println("In main");
			Thread.sleep(1000);
		}

	}
}
