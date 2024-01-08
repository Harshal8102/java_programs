//Identical Linked Lists
class Node{

	Node next = null;
	int data;

	Node(int data){

		this.data = data;
	}
}

class LinkedList{

	boolean isIdenticalLL(Node head1,Node head2){
		

		while(head1 != null && head2!= null){

			if(head1.data != head2.data){
				return false;
			}
			head1 = head1.next;
			head2 = head2.next;
		}

		if(head1 == head2)
			return true;
		else
			return false;
	}



	void printSLL(Node head){

		while(head.next != null){
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println(head.data);
	}

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		
		Node head1 = new Node(1);
		head1.next = new Node(2);
		head1.next.next = new Node(3);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(5);

		Node head2 = new Node(1);
		head2.next = new Node(2);
		head2.next.next = new Node(3);
		head2.next.next.next = new Node(4);
		head2.next.next.next.next = new Node(5);

		if(ll.isIdenticalLL(head1,head2)){

			System.out.println("identical Linked list");
		}else{
			System.out.println("non identical Linked list");
		}
	}
}























			



























