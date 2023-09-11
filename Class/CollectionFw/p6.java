//LinkedList

import java.util.*;
class LinkedListDemo{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		ll.add(20);  			//add(E)
		ll.addFirst(10);		//addFirst(E)
		ll.addLast(30);			//addLast(E)

		ll.add(2,25);			//add(int,E)

		System.out.println(ll);

		System.out.println(ll.getFirst());        //getFirst()
		System.out.println(ll.getLast());         //getLast()
							  
		System.out.println(ll.removeFirst());     //removeFirst()
		System.out.println(ll.removeLast());      //removeLast()

		ll.addLast(40);
		ll.addLast(50);
		System.out.println("after remove : " + ll);

		System.out.println(ll.indexOf(40));                 //indexOf(E)
		System.out.println(ll.lastIndexOf(40));              //lastIndexOf(E)
								     
		System.out.println(ll.peek());                      //peek()  ==> return first element
		System.out.println(ll.peekFirst());                //peekFirst() ==>  return first element
		System.out.println(ll.peekLast());		   //peekLast() ==>  return last element

		System.out.println(ll.poll());             // poll()  ==>   return & delete first element 
		System.out.println(ll.pollFirst());        // pollFirst() ==>  return & delete first element
		System.out.println(ll.pollLast());	  //  pollLast()  ==>  return & delete last element

		System.out.println(ll);
		ll.addFirst(10);
		ll.addFirst(20);

		System.out.println(ll.remove(2));          // E remove(int)  ==> remove & return element 

		System.out.println(ll.element());               // element() ==> return first element

		System.out.println(ll);	

		System.out.println(ll.offer(20));               // boolean offer(E)  ==>  add element to last
		System.out.println(ll);	

		System.out.println(ll.offerFirst(40));          // boolean offerFirst(E)  ==>  add element to first index
		System.out.println(ll);
		
		System.out.println(ll.offerLast(40));          // boolean offerLast(E)  ==>  add element to last index  same as offer()
		System.out.println(ll);

		ll.push(100);                                 //void push(E)  ==>  push element at first index

		System.out.println(ll.pop());	            // E pop()  ==>  pop element from initial index

		System.out.println(ll);
		System.out.println(ll.removeFirstOccurrence(40));
		System.out.println(ll.removeLastOccurrence(20));

		System.out.println(ll);

	}
}



