//two stack using an array

import java.util.*;
class TwoStack{

	int stackArr[];
	int top1;
	int top2;
	int maxSize;

	TwoStack(int size){

		stackArr = new int[size];
		this.top1 = -1;
		this.top2 = size;
		maxSize = size;
	}

	void push1(int data){

		if(top2-top1 > 1){

			top1++;
			stackArr[top1] = data;
		}else{
			System.out.println("stack overflow");
		}
	}

	void push2(int data){

		if(top2-top1 > 1){

			top2--;
			stackArr[top2] = data;
		}else{
			System.out.println("stack overflow");
		}
	}

	int pop1(){

		if(top1 == -1){

			System.out.println("empty stack");
			return -1;
		}else{
			int data = stackArr[top1];
			top1--;
			return data;
		}
	}
	
	int pop2(){

		if(top2 == maxSize){

			System.out.println("empty stack");
			return -1;
		}else{
			int data = stackArr[top2];
			top2++;
			return data;
		}
	}
}
class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of an array");
		int size = sc.nextInt();

		TwoStack s = new TwoStack(size);

		char ch;
		do{
			System.out.println("1. push1");
			System.out.println("2. push2");
			System.out.println("3. pop1");
			System.out.println("4. pop2");

			System.out.println("enter choice");
			int choice = sc.nextInt();

			switch(choice){

				case 1 :{
						System.out.println("enter data to push in stack1");
						int data = sc.nextInt();
						s.push1(data);
					}
					break;
				
				case 2 : {
						System.out.println("enter data to push in stack2");
						int data = sc.nextInt();
						s.push2(data);
					}
					break;
				case 3 : {
						 int data = s.pop1();
						 if(data != -1){
							 System.out.println(data);
						 }
					}
					break;
				case 4 : {
						 int data = s.pop2();
						 if(data != -1){
							 System.out.println(data);
						 }
					}
					break;
				default : System.out.println("invalid choice");
					  break;
			}

			System.out.println("do u want to continue?");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');
	}
}
						



