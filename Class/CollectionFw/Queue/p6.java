//Methods of Deque

import java.util.*;
class DequeDemo{

	public static void main(String[] args){

		Deque obj = new ArrayDeque();

		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);

		System.out.println(obj);

		obj.offerFirst(5);     //offerFirst(E)
		obj.offerLast(50);     //offerLast(E)

		System.out.println(obj);

		System.out.println(obj.pollFirst());     //pollFirst()
		System.out.println(obj.pollLast());	//pollLast()
		System.out.println(obj);

		System.out.println(obj.peekFirst());     //peekFirst()
		System.out.println(obj.peekLast());	//peekLast()
		System.out.println(obj);

		//Iterator<E> iterator()
		Iterator itr = obj.iterator();
		
		while(itr.hasNext()){
			System.out.print(itr.next() + "   ");
		}
		System.out.println();

		//Iterator<E> descendingIterator()
		Iterator itr2 = obj.descendingIterator();

		while(itr2.hasNext()){
			System.out.print(itr2.next() + "   ");
		}
		System.out.println();

	}
}
