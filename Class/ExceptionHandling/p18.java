class Demo{

	public static void main(String[] args){


		try{
			throw new Exception("exception occur");

		}catch(Exception obj){

			System.out.println("handled");
			obj.printStackTrace();
		}
	}
}
