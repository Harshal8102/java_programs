//Add two numbers represented by Linked List
import java.util.*;
class Node{

	Node next = null;
	int data;

	Node(int data){
		this.data = data;
	}
}

class Client{

	static Node reverse(Node head){

		Node curr = head;
		Node prev = null;
		Node forward = null;

		while(curr != null){

			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}

		return prev;
	}

	static Node addTwoLists(Node first,Node second){

		if(first == null)
			return second;
		if(second == null)
			return first;

		first = reverse(first);
		second = reverse(second);

		int carry = 0;

		Node head = null;

		while(first != null || second != null || carry != 0){

			int sum = (first != null ? first.data : 0) + (second != null ? second.data : 0) + carry;

			carry = sum/10;
			int digit = sum%10;

			Node newNode = new Node(digit);

			if(head == null){
				head = newNode;
			}else{
				newNode.next = head;
				head = newNode;
			}

			if(first != null)
				first = first.next;
			if(second != null)
				second = second.next;
		}

		return head;
	}

	static void printSLL(Node head){

		while(head.next != null){

			System.out.print(head.data + "   ");
			head = head.next;
		}
		System.out.println(head.data);
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("enter list1 size");
		int s1 = sc.nextInt();
		System.out.println("enter list2 size");
		int s2 = sc.nextInt();

		System.out.println("enter list1 data:");
		Node head1 = new Node(sc.nextInt());
		Node node1 = head1;
		for(int i=1; i<s1; i++){

			int data = sc.nextInt();
			node1.next = new Node(data);
			node1 = node1.next;
		}

		System.out.println("enter list2 data:");
		Node head2 = new Node(sc.nextInt());
		Node node2 = head2;
		for(int i=1; i<s2; i++){

			int data = sc.nextInt();
			node2.next = new Node(data);
			node2 = node2.next;
		}

		Node head = addTwoLists(head1,head2);

		System.out.println("Addition of two Linked list:");
		printSLL(head);
	}
}
