//PriorityBlockingQueue

import java.util.concurrent.*;
class demo{

	public static void main(String[] args){

		PriorityBlockingQueue pbq = new PriorityBlockingQueue(3);

		pbq.offer(10);
		pbq.offer(20);
		pbq.offer(30);

		System.out.println(pbq);
		
		System.out.println(pbq.remainingCapacity());
		pbq.put(40);

		System.out.println(pbq);
		System.out.println(pbq.remainingCapacity());
	}
}
