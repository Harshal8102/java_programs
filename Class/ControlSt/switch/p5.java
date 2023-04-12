import java.util.Scanner;

class c2w{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int x = obj.nextInt();

		if(x>5){
			x = 6;
		}

		switch(x){

			case 0 : System.out.println("zero");
				 break;
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
			case 6 : System.out.println("entered number is greater than 5");
				 break;
		}
	}
}

				 
