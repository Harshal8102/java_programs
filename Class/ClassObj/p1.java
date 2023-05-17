class Country{

	String myCountry = "India";

	long population = 450000000;


	void AboutIndia(){

		System.out.println("My Country : " + myCountry);

		System.out.println("Population : " + population);

		int NoOfStates = 28;

		int NoOfUnionTer = 8;

		String capital = "Delhi";

		float LiteracyRate = 77.0f;

		System.out.println("No. of states : " + NoOfStates);
		System.out.println("No. of Union Teritory : " + NoOfUnionTer);
		System.out.println("Capital state : " + capital);
		System.out.println("Literacy rate : " + LiteracyRate);

	}
}

class people{

	public static void main(String[] args){

		Country obj = new Country();

		obj.AboutIndia();
	}
}




