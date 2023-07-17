class Demo{

	int x = 10;

	Demo(){
		
		System.out.println("constructor");
	}

	{                                                                          //instance block

		System.out.println("instance block 1");           
	}

	public static void main(String[] args){

		Demo obj = new Demo();
		System.out.println("main");
	}
	{                                                                          //instance block

		System.out.println("instance block 2");
	}
}
