//Circular Queue implementation by an array
import java.util.*;
class QueueDemo{

	int queueArr[];
	int front;
	int rear;
	int maxSize;

	QueueDemo(int size){

		this.queueArr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.maxSize = size;
	}

	void enqueue(int data){

		if(rear == maxSize-1 && front == 0 || (rear+1)%maxSize == front){
			System.out.println("queue is full");
			return;
		}else if(rear == maxSize-1 && front != 0){
			rear = 0;
		}else if(front == -1){
			front = rear = 0;
		}else{
			rear++;
		}

		queueArr[rear] = data;
	}

	int dequeue(){

		if(front == -1){
			System.out.println("queue is empty");
			return -1;
		}else{
			int ret = queueArr[front];
			
			if(front == rear){
				front = rear = -1;
			}else if(front == maxSize-1){
				front = 0;
			}else{
				front++;
			}

			return ret;
		}
	}

	boolean empty(){

		if(front == -1)
			return true;
		else
			return false;
	}

	int front(){

		if(front == -1){
			System.out.println("queue is empty");
			return -1;
		}else{
			return queueArr[front];
		}
	}
	int rear(){

		if(rear == -1){
			System.out.println("queue is empty");
			return -1;
		}else{
			return queueArr[rear];
		}
	}

	void printQueue(){

		if(front == -1){
			System.out.println("queue is empty");
		}else{
			if(front <= rear){

				for(int i=front; i<= rear; i++){
					System.out.print(queueArr[i] + "  ");
				}
			}else{
				for(int i=front; i<maxSize; i++){
					System.out.print(queueArr[i] + "  ");
				}
				for(int i=0; i<=rear; i++){
					System.out.print(queueArr[i] + "  ");
				}
			}
			System.out.println();
		}
	}	
}
class Client{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of queue");
		int size = sc.nextInt();

		QueueDemo q = new QueueDemo(size);

		char ch;
		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.printQueue");

			System.out.println("enter choice");
			int choice = sc.nextInt();

			switch(choice){

				case 1 : {
						 System.out.println("enter data to enqueue");
						 int data = sc.nextInt();
						 q.enqueue(data);
					}
					break;
				case 2 : {
						int ret = q.dequeue();
						if(ret != -1){
	
							System.out.println(ret + " popped");
						}
					}
					break;
				case 3 : {
						 if(q.empty()){
							 System.out.println("queue is empty");
						 }else{
							 System.out.println("queue is unempty");
						 }
					}
					break;
				case 4 : {
						 int ret = q.front();
						 if(ret != -1)
							 System.out.println(ret);
					}
					break;
				case 5 : {
						 int ret = q.rear();
						 if(ret != -1)
							 System.out.println(ret);
					}
					break;
				case 6 : {
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


				















		
		
		

		








































