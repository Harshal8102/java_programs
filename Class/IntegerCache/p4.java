class demo{

	public static void main(String[] args){

		int x = 100;
		int y = 100;

		if(System.identityHashCode(x) == System.identityHashCode(y)){

			System.out.println("equal");
		}else{
			System.out.println("notequal");
		}
	}
}
