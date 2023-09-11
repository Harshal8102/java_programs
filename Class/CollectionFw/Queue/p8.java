
//Methods of BlockingQueue
import java.util.concurrent.*;
import java.util.*;
class demo{

	public static void main(String[] args)throws InterruptedException{

		BlockingQueue bQueue = new ArrayBlockingQueue(3);


		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);      		//boolean offer(E)

		System.out.println(bQueue);

		bQueue.offer(40, 3, TimeUnit.SECONDS);          //boolean offer(E, long timeout, java.util.concurrent.TimeUnit unit)

		System.out.println(bQueue);

		System.out.println(bQueue.take());         //E take() throws InterruptedException   or Thread get block if queue empty
		System.out.println(bQueue);

		System.out.println(bQueue.poll(3,TimeUnit.SECONDS));        //E poll(long timeout , TimeUnit unit)

		System.out.println(bQueue);      

		System.out.println(bQueue.remainingCapacity());     // int remainingCapacity()
		bQueue.put(40);
		bQueue.put(50);
		System.out.println(bQueue);

		//int drainTo(Collection)
		ArrayList al = new ArrayList();
		System.out.println("ArrayList " + al);

		System.out.println(bQueue.drainTo(al));

		System.out.println("ArrayList " + al);
		System.out.println(bQueue);

		//int drainTo(Collection , int)   ==> here int parameter is no. of elements to shift to collection
			
	}
}


