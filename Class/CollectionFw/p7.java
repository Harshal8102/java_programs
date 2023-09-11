//Iterator

import java.util.*;

class Demo{
	
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add("kanha");
		al.add("rahul");
		al.add("dss");

		Iterator it = al.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			if("rahul".equals(it.next())){
				it.remove();
			}

			System.out.println(it.next());
		}

		System.out.println(it.getClass().getName());
		
		Demo obj = new Demo();
	}
}

