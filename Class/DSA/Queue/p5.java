//Dequeue implementation by an array

import java.util.*;
class DequeueD{

	int dequeueArr[];
	int front;
	int rear;
	int maxSize;

	DequeueD(int size){

		this.dequeueArr = new int[size];
		this.front = -1;
		this.rear = -1;
		this.maxSize = size;
	}

	void enqueueBack(int data){          //pushback
		
		if((rear == maxSize-1 && front == 0) || ((rear+1)%maxSize == front) ){

			System.out.println("queue is full");
			return;
		}

		if(front == -1){
			rear = front = 0;
		}else if(rear == maxSize-1){
			rear = 0;
		}else{
			rear++;
		}

		dequeueArr[rear] = data;
	}

	int dequeueFront(){            //popfront

		if(front == -1){
			System.out.println("Dequeue is already empty");
			return -1;
		}else{
			int ret = dequeueArr[front];
			
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

	void enqueueFront(int data){       //pushfront
		
		if((rear == maxSize-1 && front == 0) || ((rear+1)%maxSize == front)){

			System.out.println("dequeue is full");
			return;
		}

		if(front == -1){
			front = rear = 0;
		}else if(front == 0 ){
			front = maxSize-1;
		}else{
			front--;
		}

		dequeueArr[front] = data;
	}

	int dequeueBack(){               //popback

		if(front == -1){
			System.out.println("already empty");
			return -1;
		}

		int ret = dequeueArr[rear];

		if(front == rear){
			front = rear = -1;
		}else if(rear == 0){
			rear = maxSize-1;
		}else{
			rear--;
		}

		return ret;
	}

	boolean empty(){

		if(front == -1)
			return true;
		else
			return false;
	}

	int front(){

		if(front == -1){
			System.out.println("dequeue is empty");
			return -1;
		}

		return dequeueArr[front];
	}

	int rear(){
		
		if(front == -1){
			System.out.println("dequeue is empty");
			return -1;
		}

		return dequeueArr[rear];
	}

	void printQueue(){

		if(front == -1){
			System.out.println("queue is empty");
		}else{
			if(front <= rear){

				for(int i=front; i<= rear; i++){
					System.out.print(dequeueArr[i] + "  ");
				}
			}else{
				for(int i=front; i<maxSize; i++){
					System.out.print(dequeueArr[i] + "  ");
				}
				for(int i=0; i<=rear; i++){
					System.out.print(dequeueArr[i] + "  ");
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

		DequeueD q = new DequeueD(size);

		char ch;
		do{
			System.out.println("1.enqueue Back");
			System.out.println("2.dequeue Front");
			System.out.println("3.enqueue Front");
			System.out.println("4.dequeue Back");
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


				















		
		
		

		








































