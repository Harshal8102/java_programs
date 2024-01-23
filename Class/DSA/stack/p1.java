//Stack implementation by array

import java.io.*;
class Stack{

	int stackArr[];
	int maxSize;
	int top = -1;

	Stack(int size){

		this.stackArr = new int[size];
		this.maxSize = size;
	}

	void push(int data){

		if(top == maxSize-1){

			System.out.println("stack overflow");
			return;
		}else{
			top++;
			stackArr[top] = data;
		}
	}

	boolean empty(){

		if(top == -1)
			return true;
		else
			return false;
	}

	int pop(){

		if(empty()){

			System.out.println("stack already is empty");
			return -1;
		}else{
			int val = stackArr[top];
			top--;
			return val;
		}
	}

	int peek(){

		if(empty()){

			System.out.println("stack is empty");
			return -1;
		}else{
			return stackArr[top];
		}
	}

	int size(){

		return top+1;
	}

	void printStack(){

		if(top ==-1)
			System.out.println("[]");
		else{
			System.out.print("[ ");
			for(int i=0; i<=top; i++){
				System.out.print(stackArr[i] + "  ");
			}
			System.out.println("]");
		}
	}

	int capacity(){
		return stackArr.length;
	}
}
class Client{

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter stack size");
		int size = Integer.parseInt(br.readLine());

		Stack s = new Stack(size);
		char ch;

		do{
			System.out.println("Stack operations:");
			System.out.println("1. push data in the stack");
			System.out.println("2. pop data from the stack");
			System.out.println("3. peek");
			System.out.println("4. check empty or not");
			System.out.println("5. size of stack");
			System.out.println("6. print the stack");
			System.out.println("7. capacity of stack");

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
						 s.printStack();
					}
					break;
				case 7 : System.out.println(s.capacity());
					 break;
				default :
					 System.out.println("invalid choice");
			}

			System.out.println("do u want to continue");
			ch = br.readLine().charAt(0);
	
		}while(ch == 'y' || ch =='Y');
	}
}









