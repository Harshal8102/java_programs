class Parent{

	Parent(){

		System.out.println("In parent constructor");
	}

	void ParentProperty(){

		System.out.println("Flat, car, gold");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("In child constructor");
	}
}

class Client{

	public static void main(String[] args){

		Parent obj = new Child();
		obj.ParentProperty();
	}
}

		
		
