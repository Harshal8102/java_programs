//Doubly linkedlist Insertion at given position

import java.util.*;
class Node{

	Node prev = null;
	int data;
	Node next = null;

	Node(int data){

		this.data = data;
	}
}
class LinkedList{

	Node head = null;

	void addFirst(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}else{
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	void addLast(int data){

		Node newNode = new Node(data);

		if(head == null){
			head = newNode;
		}else{
			Node temp = head;

			while(temp.next != null){

				temp = temp.next;
			}

			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	int countNode(){

		Node temp = head;

		if(temp == null)
			return 0;
		else{
			int count = 1;
			while(temp.next != null){
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	
	void addAtPos(int data,int pos){

		Node newNode = new Node(data);

		if(pos <= 0 || pos >=countNode()+2){

			System.out.println("wrong input");
			return;
		}else{
			if(pos == 1){
				addFirst(data);
			}else if(pos == countNode()+1){
				addLast(data);
			}else{
				Node temp = head;

				while(pos-2 == 0){
					temp = temp.next;
					pos--;
				}

				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next.prev = newNode;
				temp.next = newNode;
			}
		}
	}
	void printDLL(){

		Node temp = head;
		while(temp.next != null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
class Client{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();
			
		Scanner sc = new Scanner(System.in);

		char ch;
		do{
			System.out.println("Linkedlist menu:");
			System.out.println("1. addFirst");
			System.out.println("2. addLast");
			System.out.println("3. add At Position");
			System.out.println("4. count Nodes");
			System.out.println("5. print Doubly linked list");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch(choice){

				case 1 :{
						System.out.println("enter data to add First");
						int data = sc.nextInt();
						ll.addFirst(data);
					}
					break;
				case 2 :{
						System.out.println("Enter data to add Last");
						int data = sc.nextInt();
						ll.addLast(data);
					}
					break;
				case 3 :{
						System.out.println("enter data");
						int data = sc.nextInt();
						System.out.println("enter position");
						int pos = sc.nextInt();
						ll.addAtPos(data,pos);
					}
					break;
				case 4 :
						System.out.println("total no. of nodes : " + ll.countNode());
						break;
				case 5 :
						ll.printDLL();
						break;
				default :
						System.out.println("invalid choice");
						break;
			}

			System.out.println("do u want to continue");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
























































