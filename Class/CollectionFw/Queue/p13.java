

//PriorityBlockingQueue using comparator

import java.util.concurrent.*;
import java.util.*;
class demo{

	public static void main(String[] args){

		PriorityBlockingQueue pbq = new PriorityBlockingQueue(3,Collections.reverseOrder());

		pbq.offer("shashi");
		pbq.offer("kanha");
		pbq.offer("tejas");
		pbq.offer("harshal");

		System.out.println(pbq);

	}
}
