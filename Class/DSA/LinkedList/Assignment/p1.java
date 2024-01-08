//Count nodes of linkedlist

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

	void addFirst( int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}else{

			newNode.next = head;
			head = newNode;
		}
	}
			

	int countNode(){

		Node temp = head;
		int count = 0;

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

		ll.head = new Node(10);
		ll.head.next = new Node(20);
		ll.head.next.next = new Node(30);
		ll.head.next.next.next = new Node(40);

		System.out.println(ll.countNode());

		ll.head.next.next.next.next = new Node(50);
		ll.head.next.next.next.next.next = new Node(60);

		System.out.println(ll.countNode());
	}
}



























