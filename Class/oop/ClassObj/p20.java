class Demo{

	static int y = 20;

	Demo(){
		System.out.println("In constructor");
		System.out.println(y);
	}

	static{                                                                   //static block
		System.out.println("In static block 1");
	}


	{                                                                         //instance block
		System.out.println("In instance block 1");
	}

	public static void main(String[] args){
		Demo obj = new Demo();
	}

	static{
		System.out.println("In static block 2");                               //static block
	}


	{
		System.out.println("In instance block 2");                            //instance block
	}

}
