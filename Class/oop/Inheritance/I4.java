class Parent{

	Parent(){

		System.out.println("In parent constructor");
		System.out.println(System.identityHashCode(this));
		System.out.println(this);
	}

	Parent(Parent xyz){    //also Parent(Child xyz)

		System.out.println("In parent constructor xyz");
		System.out.println(System.identityHashCode(xyz));
		System.out.println(xyz);
		System.out.println(this);
	}

}

class Child extends Parent{

	Child(){
	
		System.out.println("In child constructor");
		System.out.println(System.identityHashCode(this));
		System.out.println(this);
	}
		
	Child(Child xyz){
		super(xyz);
		System.out.println("In child constructor xyz");
		System.out.println(System.identityHashCode(xyz));
		System.out.println(xyz);
		System.out.println(this);
	}
}
class Client{
	public static void main(String[] args){

		Child obj = new Child();
		Child obj2 = new Child(obj);
	}
}


