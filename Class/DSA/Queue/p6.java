// Dequeue(Double ended queue) implementation by  LinkedList

import java.util.*;
class QueueDemo{

	QueueDemo front;
	QueueDemo rear;
	QueueDemo next;
	int data;

	QueueDemo(int data){

		this.data = data;
		this.front = null;
		this.rear = null;
		this.next = null;
	}
	QueueDemo(){
	}

	void enqueueBack(int data){

		QueueDemo newNode = new QueueDemo(data);

		if(rear == null){

			front = rear = newNode;
		}else{
			rear.next = newNode;
		       	rear = rear.next;
		}	
	}

	int dequeueFront(){

		if(front == null){

			System.out.println("queue is empty");
			return -1;
		}else{
			int ret = front.data;
			
			if(front == rear){
				front = rear = null;
			}else{
				front = front.next;
			}

			return ret;
		}
	}

	void enqueueFront(int data){

		QueueDemo newNode = new QueueDemo(data);

		if(front == null){

			front = rear = newNode;
		}else{
			newNode.next = front;
			front = newNode;
		}	
	}

	int dequeueBack(){

		if(front == null){

			System.out.println("queue is empty");
			return -1;
		}else{
			int ret = rear.data;
			
			if(front == rear){
				front = rear = null;
			}else{
				QueueDemo temp = front;

				while(temp.next != rear){
					temp = temp.next;
				}
				temp.next = null;
				rear = temp;
			}

			return ret;
		}
	}

	boolean empty(){

		if(front == null)
			return true;
		else
			return false;
	}

	int front(){

		if(front == null){
			System.out.println("queue is empty");
			return -1;
		}else{
			return front.data;
		}
	}

	int rear(){

		if(rear == null){
			System.out.println("queue is empty");
			return -1;
		}else{
			return rear.data;
		}
	}

	void printQueue(){

		if(front == null){
			System.out.println("queue is empty");
		}else{
			QueueDemo temp = front;

			while(temp.next != null){

				System.out.print(temp.data + "  ");
				temp = temp.next;
			}

			System.out.println(temp.data);
		}
	}	
}
class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		QueueDemo q = new QueueDemo();

		char ch;
		do{
			System.out.println("1.enqueue back");
			System.out.println("2.dequeue front");
			System.out.println("3.enqueue front");
			System.out.println("4.dequeue back");
			System.out.println("5.empty");
			System.out.println("6.front");
			System.out.println("7.rear");
			System.out.println("8.printQueue");

			System.out.println("enter choice");
			int choice = sc.nextInt();

			switch(choice){

				case 1 : {
						 System.out.println("enter data to enqueue back");
						 int data = sc.nextInt();
						 q.enqueueBack(data);
					}
					break;
				case 2 : {
						int ret = q.dequeueFront();
						if(ret != -1){
	
							System.out.println(ret + " popped");
						}
					}
					break;
				case 3 : {
						 System.out.println("enter data to enqueue front");
						 int data = sc.nextInt();
						 q.enqueueFront(data);
					}
					break;
				case 4 : {
						int ret = q.dequeueBack();
						if(ret != -1){
	
							System.out.println(ret + " popped");
						}
					}
					break;
				case 5 : {
						 if(q.empty()){
							 System.out.println("queue is empty");
						 }else{
							 System.out.println("queue is unempty");
						 }
					}
					break;
				case 6 : {
						 int ret = q.front();
						 if(ret != -1)
							 System.out.println(ret);
					}
					break;
				case 7 : {
						 int ret = q.rear();
						 if(ret != -1)
							 System.out.println(ret);
					}
					break;
				case 8 : {
						 q.printQueue();
					}
					break;
				default : {
						  System.out.println("invalid choice");
					}
					break;
			}

			System.out.println("do u want to continue?");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');
	}
}


				















		
		
		

		








































