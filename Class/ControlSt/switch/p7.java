import java.util.Scanner;

class c2w{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("What's your interest?");
		System.out.println("1.movies");
		System.out.println("2.series");
		System.out.println("Enter your choice 1 or 2:");

		int choice = obj.nextInt();

		switch(choice){

			case 1 : System.out.println("Movie you wish to watch today");
                                 System.out.println("1.Founder");
                                 System.out.println("2.Snowden");
                                 System.out.println("3.Jobs");
                                 System.out.println("4.Her");
                                 System.out.println("5.Social Network");
                                 System.out.println("6.Wall-E");
                                 System.out.println("7.Ai");

				 System.out.println("Enter your choice: ");
				 int movie = obj.nextInt();

				 switch(movie){
					 case 1 : System.out.println("Founder");
						  break;
					 case 2 : System.out.println("Snowden");
						  break;
					 case 3 : System.out.println("Jobs");
						  break;
					 case 4 : System.out.println("Her");
						  break;
					 case 5 : System.out.println("Social Network");
						  break;
					 case 6 : System.out.println("Wall-E");
						  break;
					 case 7 : System.out.println("Ai");
						  break;
					 default : System.out.println("No-match");
						   break;
				 }
				 break;
			case 2 : 
			         System.out.println("Best series to watch:");
                                 System.out.println("1.Silicon valley");
                                 System.out.println("2.Devs");
                                 System.out.println("3.the IT crowd");
                                 System.out.println("4.Mr Robot");

				 System.out.println("Enter your choice: ");
				 int series = obj.nextInt();

				 switch(series){
					 case 1 : System.out.println("Silicon valley");
						  break;
					 case 2 : System.out.println("Devs");
						  break;
					 case 3 : System.out.println("the IT crowd");
						  break;
					 case 4 : System.out.println("Mr Robot");
						  break;
					 default : System.out.println("No match");
						   break;
				 }
				 break;
			default : System.out.println("No match");
				  break;
		}
	}
}

					 
		
		
		
		
		
		
		
