//Multi-dimensional ArrayList

import java.util.*;
class demo{

	public static void main(String[] args){

		ArrayList<ArrayList> mainList = new ArrayList();

		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add("harshal");
		al1.add('H');

		ArrayList al2 = new ArrayList();
		al2.add(30);
		al2.add(40);
		al2.add("Mohite");
		al2.add('M');

		mainList.add(al1);
		mainList.add(al2);

		System.out.println(mainList);
		for(ArrayList currList : mainList){

			for(var al : currList){

				System.out.print(al + "  ");
			}
			System.out.println();
		}
	}
}
