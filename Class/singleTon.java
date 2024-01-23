
class Demo{

	static Demo obj = new Demo();

	private Demo(){
	}

	static Demo getObject(){

		return obj;
	}

}
class Client{

	public static void main(String[] args){

		Demo obj = Demo.getObject();
		System.out.println(obj); //1000
		
		Demo obj1 = Demo.obj;
		System.out.println(obj1); //1000
		
		Demo obj2 = Demo.getObject();
		System.out.println(obj2);  //1000
	}
}

