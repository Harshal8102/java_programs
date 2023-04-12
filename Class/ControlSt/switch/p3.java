class switchdemo{

	public static void main(String[] args){

		System.out.println("oh pune !!!");
		String str = "Non veg";

		switch(str){

			case "veg" :

				String str1 = "Starter";
				switch(str1){
					case "Starter":
						System.out.println("order chillies");
						break;
					case "Maincourse":
						System.out.println("order handii");
						break;
				}
				break;
			case "Non veg":
				String str2 = "Starter";
				switch(str2){
					case "Starter":
						System.out.println("order chicken chillies");
						break;
					case "Maincourse":
						System.out.println("order chicken handii");
						break;
				}
				break;
			default:
				System.out.println("No match");
				break;
		}
	}
}

				
				
