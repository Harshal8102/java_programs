class ClsObj{

        static int y = 20; 	//Non-static variable or instance variable

	static void fun(){

		int z = 20;                  //local variable or non-static varaiable
		System.out.println(System.identityHashCode(z));
	}

	public static void main(String[] args){
		
	       int x = 20;		//local variable or non-static variable
	

		fun();
	}

}
