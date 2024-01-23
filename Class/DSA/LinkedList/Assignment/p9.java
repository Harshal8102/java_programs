//Merge sort in Doubly LinkedList

import java.util.*;
class Node{

	int data;
	Node next = null;
	Node prev = null;

	Node(int data){

		this.data = data;
	}
}

class DoublyLinkedList{

	Node mergeLists(Node first,Node second){

		if(first == null)
			return second;
		if(second ==  null)
			return first;

		if(first.data < second.data){
			first.next = mergeLists(first.next,second);
			first.prev = null;
			first.next.prev = first;
			return first;
		}else{
			second.next = mergeLists(first,second.next);
			second.prev = null;
			second.next.prev = second;
			return second;
		}

/*my solution
		Node head = null;
		if(first.data > second.data){
			head = first;
			head.prev = null;
			first = first.next;
		}else{
			head = second;
			head.prev = null;
			second = second.next;
		}
		Node temp = head;

		while(first != null && second != null){
			if(first.data > second.data){
				temp.next = first;
				first.prev = temp;
				first = first.next;
			}else{
				temp.next = second;
				second.prev = temp;
				second = second.next;
			}
			temp = temp.next;
		}
		while(first != null){
			temp.next = first;
			first.prev = temp;
			first = first.next;
			temp = temp.next;
		}

		while(second != null){
			temp.next = second;
			second.prev = temp;
			second = second.next;
			temp = temp.next;
		}
		return head;*/
	}

	Node split(Node head){

		Node slow = head;
		Node fast = head;

		while(fast.next != null && fast.next.next != null){

			slow = slow.next;
			fast = fast.next;
		}

		Node temp = slow.next;
		slow.next = null;
		return temp;
	}

	Node mergeOnDLL(Node head){

		if(head == null || head.next == null)
			return head; 

		Node midNode = split(head);

		Node first = mergeOnDLL(head);
		Node second = mergeOnDLL(midNode);

		head = mergeLists(first,second);

		return head;
	}

	Node addFirst(Node head , int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		return head;
	}

	void printDLL(Node head){
		while(head.next != null){
			System.out.print(head.data + "   ");
			head = head.next;
		}
		System.out.println(head.data);
/*
		System.out.println("node prev                    node data                  node next");

		Node temp = head;
		System.out.println();
		while(temp != null){

			System.out.println(temp.prev + "                     " + temp   +  "                  "  + temp.next);
			temp = temp.next;
		}*/
	}
}

class Client{

	public static void main(String[] args){

		DoublyLinkedList ll = new DoublyLinkedList();

		Scanner sc = new Scanner(System.in);

		Node head = null;
		char ch;

		do{
			System.out.println("LinkedList operations:");
			System.out.println("1. Add First element");
			System.out.println("2. Print Doubly linkedlist");
			System.out.println("3. Merge sort on DLL");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

	
			switch(choice){

				case 1 : {
						 System.out.println("Enter data to addFirst");
					 	 head = ll.addFirst(head,sc.nextInt());
					 }
					 break;
				case 2 : {
						 ll.printDLL(head);
					 }
					 break;
				case 3 : {
						 head = ll.mergeOnDLL(head);
					 }
					 break;
				default : System.out.println("invalid choice");
					  break;
			}

			System.out.println("do you want to continue");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
