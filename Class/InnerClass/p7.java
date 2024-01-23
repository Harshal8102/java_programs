
class Demo{

	int x = 10;

	void marry(){

		System.out.println("kriti sanon");
	}
}

class Client{

	public static void main(String[] args){

		Demo obj = new Demo(){                                //Client$1

			void marry(){

				System.out.println("Disha patani");
			}

			void gun(){
				System.out.println("in gun");
			}
		};
		obj.marry();
		obj.gun();
		
		Demo obj1 = new Demo(){                               //Client$2

			void marry(){
				System.out.println("janhvi kapoor");
				fun();
			}

			Demo fun(){
				System.out.println("in fun");
				return new Demo();
			}
		}.fun();

		obj1.marry();
	}
}

