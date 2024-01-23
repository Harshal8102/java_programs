class Parent{

	Parent(){

		System.out.println("In parent constructor");
		System.out.println(this);
	}

	void ParentProperty(){

		System.out.println("Flat, car, gold");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("In child constructor");
		System.out.println(this);
	}
}

class Client{

	public static void main(String[] args){

		Child obj = new Child();
		obj.ParentProperty();
	}
}
