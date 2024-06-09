//Singly LinkedList
//LinkedList Operations

import java.util.*;
class Node{

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
		}
	}

	void addAtPos(int pos,int data){

		if(pos <= 0 || pos >= countNode()+2){
			System.out.println("wrong input");
			return;
		}
		Node newNode = new Node(data);
		
		if(pos == 1){
			addFirst(data);
		}else if(pos == countNode()+1){
			addLast(data);
		}else{
			Node temp = head;

			while(pos-2 != 0){
				temp = temp.next;
				pos--;
			}

			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	void delFirst(){

		if(head == null){
			System.out.println("already empty");
			return;
		}else{
			if(countNode() == 1){
				head = null;
			}else{
				head = head.next;
			}
		}
	}

	void delLast(){

		if(head == null){
			System.out.println("already empty");
			return;
		}else if(head.next == null){
			head = null;
		}else{
			Node temp = head;
			while(temp.next.next != null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	void delAtPos(int pos){

		if(head == null){
			System.out.println("already empty");
			return;
		}
		if(pos <= 0 || pos >= countNode()+1){
			System.out.println("wrong input");
			return;
		}

		if(pos == 1){
			delFirst();
		}else if(pos == countNode()){
			delLast();
		}else{
			Node temp = head;
			while(pos-2 != 0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}
	}

	void printSLL(){

		Node temp = head;

		while(temp != null){

			System.out.println(temp.data + " , " + temp);
			temp = temp.next;
		}
	}

	int countNode(){

		int count = 0;
		Node temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
}

class Client{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		Scanner sc = new Scanner(System.in);

		char ch;

		do{
			System.out.println("LinkedList operations:");
			System.out.println("1. Add First element");
			System.out.println("2. Add Last element");
			System.out.println("3. Add At Position");
			System.out.println("4. Delete First element");
			System.out.println("5. Delete Last element");
			System.out.println("6. Delete At Position");
			System.out.println("7. Count the nodes");
			System.out.println("8. Print Doubly linkedlist");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			switch(choice){

				case 1 : {
						 System.out.println("Enter data to addFirst");
					 	 ll.addFirst(sc.nextInt());
					 }
					 break;
				case 2 : {
						 System.out.println("Enter data to addLast");
					 	 ll.addLast(sc.nextInt());
					 }
					 break;
				case 3 : {
						 System.out.println("Enter data to add at position");
					 	 int data = sc.nextInt();
					 	 System.out.println("Enter position");
					 	 int pos = sc.nextInt();
					 	 ll.addAtPos(pos,data);
					 }
					 break;
				case 4 :{
					 	ll.delFirst();
					}
					break;
				case 5 :{
					 	ll.delLast();
					}
					break;
				case 6 :{
					 	 System.out.println("Enter the position");
						 int pos = sc.nextInt();
						 ll.delAtPos(pos);
					}
					break;
				case 7 :{
						 int count = ll.countNode();
						 System.out.println("total nodes = " + count);
					}
					break;
				case 8 :{
						 ll.printSLL();
					}
					break;
				default :{ 
						  System.out.println("invalid input");
					 }
					 break;
			}

			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');
	}
}




































