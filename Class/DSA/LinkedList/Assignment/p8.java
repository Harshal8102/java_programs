//Insert in middle of the linkedlist
class Node{

	Node next = null;
	int data;

	Node(int data){

		this.data = data;
	}
}
class LinkedList{

	int countNode(Node head){
		int count = 0;
		while(head != null){
			count++;
			head = head.next;
		}
		return count;
	}

	Node insertAtMid(Node head,int key){
		int count = countNode(head);
		int mid;
		Node newNode = new Node(key);

		if(head == null){
			head = newNode;
			return head;
		}
		
		if(count%2 == 0){
			mid = count/2;
		}else{
			mid = (count/2)+1;
		}

		Node temp = head;
		while(mid-1 != 0){
			temp = temp.next;
			mid--;
		}

		newNode.next = temp.next;
		temp.next = newNode;

		return head;
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

		
		Node head = new Node(2);
		head.next = new Node(2);
		head.next.next = new Node(2);
	//	head.next.next.next = new Node(2);
	

		ll.printSLL(head);

		int key = 3;

		head = ll.insertAtMid(head,key);

		ll.printSLL(head);
	}
}























			



























