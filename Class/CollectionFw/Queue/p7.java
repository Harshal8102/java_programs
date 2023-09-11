
//BlockingQueue
import java.util.concurrent.*;
class BlockingQueueDemo{

	public static void main(String[] args){

		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);      		//boolean offer(E)

		System.out.println(bQueue);

		try{		
			bQueue.put(40);                 // void put(E)  throws InterruptedException 
							// Thread get block
		}catch(InterruptedException obj){

			System.out.println(obj);
		}

		System.out.println(bQueue);

	}

}
