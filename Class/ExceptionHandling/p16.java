
import java.util.*;
class demo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		try{
			if(x == 0){
				throw new ArithmeticException("Divide by zero");
			}
			System.out.println(10/x);
		}catch(ArithmeticException obj){

			System.out.println(obj);
			System.out.println(obj.toString());
			System.out.println(obj.getMessage());

			System.out.println("Exception in Thread " + Thread.currentThread().getName());
			obj.printStackTrace();
		}
	}
}



