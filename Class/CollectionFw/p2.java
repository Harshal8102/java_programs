import java.util.*;

class CollectionDemo{

	public static void main(String[] args){

		ArrayList obj = new ArrayList();
		
		//ArrayList<Integer> obj = new ArrayList<Integer>();

		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(70);
		
		System.out.println(obj);
		System.out.println(obj.get(1));

		System.out.println(obj.remove(2));

		for(var  x : obj){
			System.out.println(x);
		}
		
	}
}

