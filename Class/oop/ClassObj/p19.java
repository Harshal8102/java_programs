class Demo{

	int x = 10;

	Demo(){
		
		System.out.println("constructor");
	}

	{                                                                          //instance block

		System.out.println("instance block 1");           
	}

	static{

		System.out.println("static block");
	}

	public static void main(String[] args){

		System.out.println("main");
	
		Demo obj = new Demo();	
	}

	{                                                                          //instance block

		System.out.println("instance block 2");
	}
}
