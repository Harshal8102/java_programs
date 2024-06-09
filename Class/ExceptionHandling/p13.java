class Demo{

	void m1(){
			System.out.println("in m1");
	}
	void m2(){

		System.out.println("in m2");
	}

	public static void main(String[] args){

		System.out.println("start main");
		Demo obj = new Demo();
		obj.m1();
		obj = null;

		try{
			obj.m2();
		}catch(NullPointerException obj1){
			System.out.println("in catch");
		}finally{
			System.out.println("connection closed");
		}

		System.out.println("End main");
	}
}
