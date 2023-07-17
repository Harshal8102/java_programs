class IPL{

	String match = "RCB vs SRH"; 
	
	int TScore = 200;

	static int Virat = 100;

	void result(){

		System.out.println("Match = " + match);
		System.out.println("Total score by rcb = " + TScore);
		System.out.println("Virat kohli score = " + Virat);
	}

	public static void main(String[] args){

		IPL ipl1 = new IPL();
		IPL ipl2 = new IPL();

		ipl1.result();
		ipl2.result();

		ipl2.match = "RCB vs CSK";
	        ipl2.TScore = 150;
		ipl2.Virat = 50;

	        System.out.println("-----After changing--------");
		ipl1.result();
		ipl2.result();
	}
}
 


