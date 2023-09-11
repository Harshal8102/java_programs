
import java.util.*;
//import arithmFun.Addition;
//import arithmFun.Subtraction;
import arithmFun.*;
//port arithmFun.Division;

class  Client extends Division{


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		Addition obj = new Addition(x,y);
		System.out.println(obj.add());

		Subtraction obj1 =  new Subtraction(x,y);
		System.out.println(obj1.subtract());

		Multiplication obj2 = new Multiplication(x,y);
		System.out.println(obj2.Multiply());

		Client obj3 = new Client();
		System.out.println(obj3.divide(x,y));

		Mod obj4 = new Mod(x,y);
		System.out.println(obj4.remainder());
	}
}
