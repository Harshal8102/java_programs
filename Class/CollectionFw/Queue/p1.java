
import java.util.*;
class Demo{

	public static void main(String[] args){

		Queue que = new LinkedList();

		que.offer(10);
		que.offer(20);             //boolean offer(E) = add element
		que.offer(50);
		que.offer(40);
		que.add(30);               //boolean add(E) = add element

		System.out.println(que);

		System.out.println(que.poll());      //E poll() = remove first element        
		System.out.println(que);

		System.out.println(que.remove());      //E remove() = remove first element & if not present throws NoSuchEleException
		System.out.println(que);

		System.out.println(que.peek());      //E peek() = return first element

		System.out.println(que.element());   //E element() = return first element & if not present throws exception

		System.out.println(que);

	}
}

