/*program to print countdown of days to submit the assignment */

class days{

	public static void main(String[] args){

                int day = 0;

		for(   ; day >= 0; day-- ){

		        if(day == 0){

				System.out.println(day + " days Assignment is overdue");
				break;
			}


			System.out.println(day + " days remaining");

		}
	}
}
