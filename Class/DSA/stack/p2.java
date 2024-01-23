//Stack implementation by array

import java.io.*;
class Stack{

	Stack top = null;
	int data;
	Stack next;

	Stack(){
	
	}
	Stack(int data){

		this.data = data;
	}

	void push(int data){

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

	int pop(){

		if(empty()){

			System.out.println("stack already is empty");
			return -1;
		}else{
			int val = top.data;
			top = top.next;
			return val;
		}
	}

	int peek(){

		if(empty()){

			System.out.println("stack is empty");
			return -1;
		}else{
			return top.data;
		}
	}

	int size(){

		Stack node = top;
		int count = 0;
		while(node != null){
			count++;
			node = node.next;
		}
		return count;
	}

	void printStack(Stack top){

		if(empty())
			return;

		if(top == null){
			System.out.print("[ ");
			return;
		}else{
			printStack(top.next);
			System.out.print(top.data + "  ");
		}
		if(top == this.top){
			System.out.println(" ]");
		}
	}
}
class Client{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack s = new Stack();
		
		char ch;

		do{
			System.out.println("Stack operations:");
			System.out.println("1. push data in the stack");
			System.out.println("2. pop data from the stack");
			System.out.println("3. peek");
			System.out.println("4. check empty or not");
			System.out.println("5. size of stack");
			System.out.println("6. print the stack");
		
			System.out.println("enter the choice");
			int choice = Integer.parseInt(br.readLine());

			switch(choice){

				case 1 : {
						 System.out.println("enter data to push");
						 int data = Integer.parseInt(br.readLine());
						 s.push(data);
					}
					break;
				case 2 : {
						 int flag = s.pop();
						 if(flag != -1){
							 
							 System.out.println(flag + " popped");
						 }
					}
					break;
				case 3 : {
						 int flag = s.peek();
						 if(flag != -1){

							 System.out.println(flag);
						 }
					}
					break;
				case 4 : {
						 if(s.empty())
							 System.out.println("stack is empty");
						 else
							 System.out.println("stack is non empty");
					}
					break;
				case 5 : {
						 System.out.println(s.size());
					}
					break;
				case 6 : {
						 s.printStack(s.top);
					}
					break;
				default :
					 System.out.println("invalid choice");
			}

			System.out.println("do u want to continue");
			ch = br.readLine().charAt(0);
	
		}while(ch == 'y' || ch =='Y');
	}
}

