
import java.util.*;
class Demo{
	void printNumber(int n){
		
		if(n == 0)
			return;

		printNumber(n-1);

		System.out.println(n);
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Demo obj = new Demo();

		obj.printNumber(n);
	}
}

	
