//finding middle of linkedlist

import java.util.*;
class Node{

	Node next = null;
	int data;

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
	void printSLL(){

		Node temp  = head;

		if(temp == null)
			System.out.println("Empty linkedlist");
		else{
			while(temp != null){
				System.out.print(temp.data + "   ");
				temp = temp.next;
			}

			System.out.println();
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

	void middleNodeA1(){

		int len = countNode();
		int count = 0;
		Node temp = head;

		while(count < len/2){
			temp = temp.next;
			count++;
		}

		System.out.println("middle node data : " + temp.data);
	}

	void middleNodeA2(){

		Node slow = head;
		Node fast = head.next;

		while(fast != null){

			fast = fast.next;
			if(fast != null){
				fast = fast.next;
			}
			slow = slow.next;
		}

		System.out.println("middle node : " + slow.data);
		
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
			System.out.println("3. Print linkedlist");
			System.out.println("4. find middlenode by approach 1");
			System.out.println("5. find middlenode by approach 2");

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
				case 3 : ll.printSLL();
					 break;
				case 4 :{
						ll.middleNodeA1();
					}
					break;
				case 5 :{
						ll.middleNodeA2();
					}
					break;
				default :
						System.out.println("invalid choice");
						break;
			}

			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');

	}
}


























