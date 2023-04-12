
import java.util.Scanner;
class switchdemo{

	public static void main(String[] args){

		Scanner obj = new Scanner (System.in);

		System.out.println("Enter value of x : ");

		int x = obj.nextInt();
		switch(x){

			case 1 : System.out.println("one");
				 break;
			case 2 : System.out.println("two");
				 break;
			case 3 : System.out.println("three");
				 break;
			case 4 : System.out.println("four");
				 break;
			case 5 : System.out.println("five");
				 break;
			default : System.out.println("No match");
				  break;
		}
	
		
	}
}

