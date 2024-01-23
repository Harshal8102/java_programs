//Reverse String using Stack

import java.util.*;
class Ssack{

	Stack top = null;
	char data;
	Stack next;

	Stack(){
	}
	Stack(char data){

		this.data = data;
	}

	void push(char data){

		Stack newNode = new Stack(data);

		if(top == null){
			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;
		}
	}

	boolean empty(){

		if(top == null)
			return true;
		else
			return false;
	}

	char pop(){

		if(empty()){

			System.out.println("stack already is empty");
			return (char)-1;
		}else{
			char val = top.data;
			top = top.next;
			return val;
		}
	}
}
class Client{

	String reverseString(String str){

		Stack s = new Stack();

		for(int i=0; i<str.length(); i++){

			s.push(str.charAt(i));
		}
		int i=0; 

		char stackArr[] = new char[str.length()];

		while(!s.empty()){

			stackArr[i] = s.pop();
			i++;
		}

		return new String(stackArr);

	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.next();

		Client obj = new Client();
		
		String rev = obj.reverseString(str);

		System.out.println(rev);
	}
}
		
