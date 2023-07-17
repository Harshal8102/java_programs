//Real time example of Overriding
class Match{

	void matchType(){

		System.out.println("T20/OneDay/Test");
	}
}
class IPLMatch extends Match{

	void matchType(){

		System.out.println("T20");
	}
}

class WTC extends Match{

	void matchType(){

		System.out.println("Test");
	}
}

class Client{

	public static void main(String[] args){

		Match type1 = new Match();
		type1.matchType();

		Match type2 = new IPLMatch();
		type2.matchType();

		WTC type3 = new WTC();
		type3.matchType();

	}
}

