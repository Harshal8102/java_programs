class C2w{

	C2w(){

		System.out.println("In C2w()");
	}

	int x = 10;

	public static void main(String[] args){

		C2w obj = new C2w();
		System.out.println("In main");
		System.out.println(obj.x);
	}
}
