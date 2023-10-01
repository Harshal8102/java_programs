class Demo{

	int y = 12;

	Demo(){
		
		System.out.println("In no argu");
		System.out.println(this.y);
	}

	Demo(int x){
		this();
		System.out.println("In para");
		System.out.println(x);
	}

	Demo(Demo xyz){
		this(10);
		System.out.println("In para- Demo ");
		System.out.println(this.y);
	}


	public static void main(String[] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo(65);
		Demo obj3 = new Demo(obj1);
	}
}


