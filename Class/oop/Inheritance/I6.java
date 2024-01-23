import java.util.*;
abstract class abs{

	int x = 10;
	abstract void m();

	void n(){

		System.out.println("in parent n");
	}

	public static void main(String args[]){

	}		
}

class myclass extends abs{
	
	@Override
	void m(){	
		System.out.println(super.x);
		n();
	}
	
	public static void main(String[] args){
		myclass obj = new myclass();
		obj.m();
		
//		System.out.println(super.x); not work
	
	}
}

