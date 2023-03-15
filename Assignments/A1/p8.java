/*program to print the countdown of days to submit the assignment*/

class countdown{

	public static void main(String[] args){

		int day = 7;

		while(day != 0){

			System.out.println(day + " days remaining");
			day--;
		}

			if(day == 0){

				System.out.println("Countdown is over");
			}
			
		
	}
}
