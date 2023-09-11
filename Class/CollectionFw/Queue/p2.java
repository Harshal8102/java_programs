//PriorityQueue => internaly uses heap datastructure
import java.util.*;
class PqDemo{

	public static void main(String[] args){

		PriorityQueue pq = new PriorityQueue();

		pq.offer(20);
		pq.offer(10);
		pq.offer(50);
		pq.offer(30);
		pq.offer(40);

		System.out.println(pq);
	}
}

