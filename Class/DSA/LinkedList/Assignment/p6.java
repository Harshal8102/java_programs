//Remove duplicate element from sorted linked list
class Node{

	Node next = null;
	int data;

	Node(int data){

		this.data = data;
	}
}
class LinkedList{

	Node deleteDuplicates(Node head){
		Node node = head;

		while(node != null){

			Node temp = node;

			while(temp != null && temp.data == node.data){
				temp = temp.next;
			}

			node.next = temp;
			node = node.next;
		}
		return head;
	}

	/*my solution
	Node delNode(Node head,Node del){

		if(head == del){
			return head.next;
		}
		Node temp = head;
		while(temp.next != null && temp.next != del){
			temp = temp.next;
		}
		if(temp.next == null)
			return head;

		if(temp.next.next == null)
			temp.next = null;
		else{
			temp.next = temp.next.next;
		}
		return head;
	}

	Node deleteDuplicates(Node head){

		if(head == null)
			return null;

		Node temp = head;
		Node p_temp = null;

		while(temp.next != null){
			p_temp = temp;
			temp = temp.next;

			if(p_temp.data == temp.data){
				head = delNode(head,p_temp);
			}
		}
		return head;
		
	}*/


	void printSLL(Node head){

		while(head.next != null){
			System.out.print(head.data + " -> ");
			head = head.next;
		}
		System.out.println(head.data);
	}

	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		
		Node head = new Node(2);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(2);
	

		ll.printSLL(head);

		head = ll.deleteDuplicates(head);

		ll.printSLL(head);
	}
}























			



























