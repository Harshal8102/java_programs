

import java.util.*;
class demo{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();
		int d = 10;
		for(int i=1; i<=6; i++){

			ll.add(d);
			d += 5;
		}

		Iterator it = ll.iterator();

		System.out.println(it.getClass().getName());
		
		while(it.hasNext()){

			if(it.next() != it.next()){

				System.out.println(it.next());
			}
		}

	
	}
}
