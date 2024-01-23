//Delete element of a stack
import java.util.*;
class Stacks{

	static Stack<Integer> deleteMid(Stack<Integer> s, int n){

		
		Stack<Integer> del = new Stack<Integer>();

		if(n % 2 != 0){

			for(int i=0; i<(n+1)/2; i++){

				del.push(s.pop());
			}
		}else{
			for(int i=0; i<(n+2)/2; i++){

				del.push(s.pop());
			}
		}
		del.pop();

		while(!del.empty()){
			s.push(del.pop());
		}
		return s;
	}
}
class Client{

	public static void main(String[] args){

		Stack<Integer> s = new Stack<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of stack");
		int size = sc.nextInt();

		for(int i=0; i<size; i++){

			s.push(sc.nextInt());
		}

		System.out.println(s);
		System.out.println(Stacks.deleteMid(s,size));
	}
}




