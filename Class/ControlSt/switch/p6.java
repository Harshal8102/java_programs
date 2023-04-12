import java.util.Scanner;
class c2w{

	public static void main(String[] args){

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter num1");
		int num1 = obj.nextInt();
		System.out.println("Enter num2");
		int num2 = obj.nextInt();

		if(num1>=0 && num2>=0){
			int num3 = num1 * num2;
			System.out.println("number is " + num3);
			String str;

			if(num3%2==0){
				str = "even";
			}else{
				str = "odd";
			}
				
			
			switch(str){

				case "even" : System.out.println("Number is even");
						   break;
				case "odd" : System.out.println("Number is odd");
						   break;
			}
		}else{

			System.out.println("Sorry negative number not allowed");
		}
	}
}

