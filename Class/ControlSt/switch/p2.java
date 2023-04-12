class switchdemo{

	public static void main(String[] args){

		String str = "Mon";

		switch(str){
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
				break;
			case "Wed":
				System.out.println("Wednesday");
				break;
			default: 
				System.out.println("No match ");
				break;
		}
	}
}

