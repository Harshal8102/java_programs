//Parenthesis checker | valid parenthesis

import java.util.*;
class Parenthesis{

	boolean checkParenthesis(String str){

		Stack<Character> s = new Stack<Character>();

		for(int i=0; i<str.length(); i++){

			char ch = str.charAt(i);

			if(ch == '[' || ch == '{' || ch == '('){

				s.push(ch);
			}else{
				if(s.empty()){

					return false;
				}else{
					if(ch == ']' && s.peek() == '[' || ch == '}' && s.peek() == '{' || ch == ')' && s.peek() == '('){

						s.pop();
					}else{
						return false;
					}
				}
			}
		}

		if(s.empty())
			return true;
		else
			return false;
	}
}
class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.next();

		Parenthesis obj = new Parenthesis();

		if(obj.checkParenthesis(str)){

			System.out.println("valid parenthesis");
		}else{
			System.out.println("invalid parenthesis");
		}
	}
}

