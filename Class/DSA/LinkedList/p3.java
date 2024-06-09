//Singly  Circular LinkedList

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
			newNode.next = head;
		}else{
			Node temp = head;

			while(temp.next != head){
				temp = temp.next;
			}

			temp.next = newNode;
			newNode.next = head;
			head = newNode;
		}
		System.out.println(newNode);
	}

	void addLast(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
			newNode.next = head;
		}else{
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			
			temp.next = newNode;
			newNode.next = head;
		}
	}

	int countNode(){

		if(head == null)
			return 0;

		int count = 1;
		Node temp = head;

		while(temp.next != head){
			count++;
			temp = temp.next;
		}

		return count;
	}

	void addAtPos(int pos,int data){

		int count = countNode();

		if(pos <= 0 || pos >= count+2){

			System.out.println("wrong input");
		}else{
			if(pos == 1){
				addFirst(data);
			}else if(pos == count+1){
				addLast(data);
			}else{
				Node temp = head;
				Node newNode = new Node(data);

				while(pos-2 != 0){
					temp = temp.next;
				}

				newNode.next = temp.next;
				temp.next = newNode;
			}
		}
	}

	void delFirst(){

		if(head == null){

			System.out.println("linkedlist empty");
		}else{

			if(countNode() == 1){

				head = null;
			}else{
				Node temp = head;

				while(temp.next != head){
					temp = temp.next;
				}

				head = head.next;
				temp.next = head;
			}
		}
	}

	void delLast(){

		if(head == null){

			System.out.println("linkedlist empty");
		}else{
			if(countNode() == 1){

				head = null;
			}else{
				Node temp = head;

				while(temp.next.next != head){
					temp = temp.next;
				}

				temp.next = head;
			}
		}
		
	}

	void delAtPos(int pos){

		int count = countNode();

		if(pos <= 0 || pos >= count+1){

			System.out.println("wrong input");
		}else{
			if(pos == 1){
				delFirst();
			}else if(pos == count){
				delLast();
			}else{
				Node temp = head;
				
				while(pos-2 != 0){

					temp = temp.next;
				}

				temp.next = temp.next.next;
			}
		}
	}

	void printSCLL(){

		if(head == null){

			System.out.println("Linkedlist empty");
		}else{
			Node temp = head;
/*
			while(temp.next != head){

				System.out.print(temp.data + "->");
				temp = temp.next;
			}

			System.out.println(temp.data);*/

			System.out.println("node prev                    node data                  node next");

			System.out.println();
			while(temp.next != head){

				System.out.println(temp   +  "                  "  + temp.next);
				temp = temp.next;
			}
			System.out.println(temp + "                   " + temp.next);
	
		}
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
				case 4 : {
					 	ll.delFirst();
					 }
					break;
				case 5 : {
					 	ll.delLast();
					}
					break;
				case 6 : {
					 	 System.out.println("Enter the position");
						 int pos = sc.nextInt();
						 ll.delAtPos(pos);
					}
					break;
				case 7 : {
						 int count = ll.countNode();
						 System.out.println("total nodes = " + count);
					}
					break;
				case 8 : {
						 ll.printSCLL();
					}
					break;
				default : { 
						  System.out.println("invalid input");
					 }
					 break;
			}

			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');
	}
}




































