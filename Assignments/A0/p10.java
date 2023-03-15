class real{

	public static void main(String[] args){

		int i = 22;

		if(i>=7 && i<=10){
			System.out.println("I do my breakfast");
		}else if(i>10 && i<12){
			System.out.println("Timepass");
		}else if(i>=12 && i<=15){
			System.out.println("I do my lunch");
		}else if(i>15 && i<17){
			System.out.println("I do some rest!!!");
		}else if(i>=17 && i<=20){
			System.out.println("I go outside & explore the town");
		}else if(i>20 && i<=22){
			System.out.println("Between this I do dinner");
		}else if(i>22 && i<=24){
			System.out.println("I do coding");
		}else if(i>24 && i<7){
			System.out.println("I sleep");
		}else{
			System.out.println("Invalid time");
		}
	}
}

