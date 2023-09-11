
//LinkedBlockingQueue

import java.util.concurrent.*;
import java.util.*;
class demo{

	public static void main(String[] args)throws InterruptedException{

		LinkedBlockingQueue lbq = new LinkedBlockingQueue();
		LinkedBlockingQueue lbq2 = new LinkedBlockingQueue(3);
		

		lbq.offer(10);
		lbq.put(20);
		lbq.put(30);

		System.out.println(lbq);

		lbq.offer(40,3,TimeUnit.SECONDS);
	
		lbq.put(40);

		System.out.println(lbq);

		Iterator itr = lbq.iterator();        //Iterator iterator()

		while(itr.hasNext()){

			System.out.println(itr.next());
		}
	}
}
