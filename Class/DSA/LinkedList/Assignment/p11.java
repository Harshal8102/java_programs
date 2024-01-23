//Intersection point in y shaped linkedlist

import java.util.*;
class Node{

	Node next = null;
	int data;

	Node(int data){
		this.data = data;
	}
}

class LinkedList{

	void addFirst(Node head,int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}
	void printSLL(Node head){

		while(head != null){

			System.out.print(head.data + "   ");
			head = head.next;
		}
		System.out.println();
	}
	int findIntersection(Node head1,Node head2){

		Node node1 = head1;
		Node node2 = head2;

		while(node1 != node2){

			if(node1 == null){
				node1 = head2;
			}else{
				node1 = node1.next;
			}

			if(node2 == null){
				node2 = head1;
			}else{
				node2 = node2.next;
			}
		}

		if(node1 == null){
			return -1;
		}else{
			return node1.data;
		}
	}


	public static void main(String[] args){

		LinkedList ll = new LinkedList();

		Scanner sc = new Scanner(System.in);

		Node headA = null;
		Node headB = null;
		char ch;

		do{
			System.out.println("LinkedList operations:");
			System.out.println("1. Add First element in linkedlist1");
			System.out.println("2. Add first element in linkedlist 2 ");
			System.out.println("3. Print linkedlist 1");
			System.out.println("4. print linkedlist 2");
			System.out.println("5. find intersection point");

			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

	
			switch(choice){

				case 1 : {
						 System.out.println("Enter data in linked list 1");
					 	 headA = ll.addFirst(headA,sc.nextInt());
					 }
					 break;
				case 2 : {
						 System.out.println("Enter data in linked list 2");
						 headB = ll.addFirst(headB,sc.nextInt());
					 }
					 break;
				case 3 : 
						 ll.printSLL(headA);
						break;
				case 4 :
						ll.printSLL(headB);
						break;
				case 5:
						System.out.println("intersection point : " + ll.findIntersection(headA,headB));
								break;
				default :
						System.out.println("invalid choice");
						break;
			}

			System.out.println("do u want to continue : ");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
			

}














