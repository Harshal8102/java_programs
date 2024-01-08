//Find length of loop

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

	int countNodesInLoop(){

		HashSet<Node> set = new HashSet<>();

		Node temp = head;
		int count = 0;

		while(temp != null){

			if(set.contains(temp)){

				Node s = temp;

				do{
					count++;
					temp = temp.next;
				}while(temp != s);

				return count;
			}

			System.out.print(temp.data + " ");

			set.add(temp);
			temp = temp.next;
		}
		return 0;
	}

}
class Client{

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		ll.head = new Node(25);
		ll.head.next = new Node(14);
		ll.head.next.next = new Node(19);
		ll.head.next.next.next = new Node(33);
		ll.head.next.next.next.next = new Node(10);
		ll.head.next.next.next.next.next = new Node(21);
		ll.head.next.next.next.next.next.next = new Node(39);
		ll.head.next.next.next.next.next.next.next = new Node(90);
		ll.head.next.next.next.next.next.next.next.next = new Node(58);
		ll.head.next.next.next.next.next.next.next.next.next = new Node(45);
		ll.head.next.next.next.next.next.next.next.next.next.next = ll.head.next.next.next;

		System.out.println(ll.countNodesInLoop());
	}
}



























