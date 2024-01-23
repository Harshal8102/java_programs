
class Demo{

	int x = 10;
	void marry(){
		System.out.println("kriti sanon");
	}
}
class Client{

	public static void main(String[] args){

		Demo obj = new Demo(){

			void marry(){

				System.out.println("Disha patani");
			}
		};

		obj.marry();
	}
}

