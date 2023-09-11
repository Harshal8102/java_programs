//Vector

import java.util.*;
class VectorDemo extends java.util.Vector{

	public static void main(String[] args){

		Vector v = new Vector();

		v.addElement(20);
		v.addElement(10);          // addElement(E)
		v.addElement(20);
		v.addElement(40);
		v.addElement("harshal");

		System.out.println(v);

		System.out.println(v.capacity());    //capacity()  

	//	System.out.println(v.removeElement(20));   //removeElement()

		System.out.println(v.size());		

		v.ensureCapacity(5);

		System.out.println(v.capacity());

		v.setSize(12);	            // set vector size & make null values			
		System.out.println(v);

		System.out.println(v.indexOf(20));
		System.out.println(v.indexOf(20,1));              //indexOf(E,int)

		System.out.println(v.lastIndexOf(20));
		System.out.println(v.lastIndexOf(20,1));           //lastIndexOf(E,int)

		System.out.println(v.elementAt(2));                  //elementAt(int)
		System.out.println(v.firstElement());			//firstElement()
		System.out.println(v.lastElement());			//lastElement()

		v.setElementAt(50,8);
		System.out.println(v);

	 	v.removeElementAt(3);              // removeElement(int);
		System.out.println(v);                
		v.insertElementAt("HM",3);          //insertElement(E,int);
		System.out.println(v);

		v.removeAllElements();        // removeAllElements();
		System.out.println(v);
	}
}
