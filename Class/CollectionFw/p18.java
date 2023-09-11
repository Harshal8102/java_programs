// STACK
import java.util.*;

class StackDemo{

	public static void main(String[] args){

		Stack s = new Stack();

		s.push(10);
		s.push(25);
		s.push(20);
		s.push(30);

		System.out.println(s);

//		System.out.println(s.pop());       // pop the data
		System.out.println(s.peek());
		System.out.println(s.peek());        //print last push data & not pop just print data

		System.out.println(s.search(30));        //search form right to left(1 to leftmost)


	}
}
