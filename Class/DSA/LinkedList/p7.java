//K-node reverse linkedlist

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

	Node kReverse(Node head,int k){

		Node curr = head;
		Node prev = null;
		Node forward = null;

		int count = 0;

		while(count < k && curr != null){

			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
			count++;
		}

		if(forward != null){

			head.next = kReverse(forward,k);
		}

		return prev;
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
			System.out.println("4. reverse k no. of nodes");
			
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
						System.out.println("enter value of k");
						int k = sc.nextInt();
						ll.head = ll.kReverse(ll.head,k);
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


























