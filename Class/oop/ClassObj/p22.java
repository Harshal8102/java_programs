class Demo{

	 int y = 12;

	Demo(){
		System.out.println("In no argu");
		System.out.println(this.y);
	
	}

	Demo(int x){

		System.out.println("In para");
		System.out.println(this.y);
	
	}

	Demo(Demo xyz){

		System.out.println("In para- Demo ");
		System.out.println(this.y);
	
	}


	public static void main(String[] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo(65);
		Demo obj3 = new Demo(obj1);
	}
}


