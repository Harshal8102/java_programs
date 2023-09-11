//ListIterator
import java.util.*;
class Demo{
	
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		ListIterator it = al.listIterator();

		while(it.hasNext()){                          //hasNext()  ==>  check element present at next index  
			if(it.next().equals(10))
				it.remove();
			System.out.println(it.next()); 		//next() ==>  return element present at next Index & move 1 step towards 

		}

		while(it.hasPrevious()){                         //hasPrevious() ==>  checks element present in current index
	
			System.out.println(it.previous());       //previous()  ==>   return element of current index  & move 1 step behind
		}

	
		it.set(50);                       // void set(E) ==> replace element at first index

		it.add(100);                     //void add(E)  ==> add element at first index

		System.out.println(al);



		//System.out.println(it.getClass().getName());
	}
}
