
// For Each loop

import java.util.*;

class Demo{

	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("harshal");
		al.add(15.25f);
		al.add(20.25);

		System.out.println(al);

		al.forEach((data) ->{              //forEach with lamda function
		       	System.out.println(data);
			}
		);

		al.forEach(x -> System.out.println(x));
	}
}



