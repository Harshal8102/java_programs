class Demo{

	public static void main(String[] args){

			System.out.println("start main");

			try{
				System.out.println(10/0);            //risky code
				
			}catch(ArithmeticException obj){
									//Handling code
				System.out.println("Exception occured");   	
			}

			System.out.println("End main");
		
	}
}
