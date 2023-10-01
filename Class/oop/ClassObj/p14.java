class IPL{

	static int NoOfTeams = 10;

	static String MostNoTrof = "Mumbai-indians";

	String favTeam = "CSK";

	void info(){

		System.out.println("No. of teams : " + NoOfTeams);
		System.out.println("Team has most no. of troffies : " + MostNoTrof);
		System.out.println("fav team : " + favTeam);
	}
}
class people{

	public static void main(String[] args){

		IPL obj1 = new IPL();
		IPL obj2 = new IPL();

		obj1.info();
		
		obj1.MostNoTrof = "CSK";
		obj1.favTeam = "Mumbai-indians";

		obj1.info();
		obj2.info();
	}
}



