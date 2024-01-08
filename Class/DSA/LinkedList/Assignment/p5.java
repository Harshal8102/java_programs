class Node{

	Node next = null;
	int data;

	Node(int data){

		this.data = data;
	}
}
class LinkedList{

	Node swapKthNode(Node head,int num,int k){

		if( k > num || k < 0)
			return head;
		if(k*2-1 == num)
			return head;

		Node x = head;
		Node x_prev = null;
		Node y = head;
		Node y_prev = null;

		for(int i=1; i<k;i++){
			x_prev = x;
			x = x.next;
		}
		for(int j=1; j<num-k+1; j++){
			y_prev = y;
			y = y.next;
		}

		if(x_prev != null)
			x_prev.next = y;
		if(y_prev != null)
			y_prev.next = x;

		Node next = x.next;
		x.next = y.next;
		y.next = next;

		if(k == 1){
			head = y;
		}
		if(k == num){
			head = x;
		}
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

		int n = 4;
		int k = 1;

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		ll.printSLL(head);

		head = ll.swapKthNode(head,n,k);

		ll.printSLL(head);
	}
}























			



























