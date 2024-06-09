import java.io.*;
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
	
		try{
			int data = sc.nextInt();
			System.out.println(10/data);
	
		}catch(ArithmeticException | NumberFormatException | InputMismatchException  obj){
								
			System.out.println("Exception handled" + obj);
		}
	}
}





