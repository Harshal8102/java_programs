//Doubly LinkedList
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

	Node head = null;

	void addFirst(int data){

		Node newNode = new Node(data);

		if(head == null){

			head = newNode;
		}else{
			newNode.next = head;
			head.prev = newNode;
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
			newNode.prev = temp;
		}
	}

	int countNode(){

		int count = 0;
		Node temp = head;

		while(temp != null){
			count++;
			temp = temp.next;
		}

		return count;
	}

	void addAtPos(int pos,int data){

		int count = countNode();

		if(pos <= 0 || pos >= count+2){

			System.out.println("wrong input");
			return;
		}

		if(pos == 1){
			
			addFirst(data);

		}else if(pos == count+1){

			addLast(data);
		}else{
			Node newNode = new Node(data);
			Node temp = head;

			while(pos-2 != 0){

				temp = temp.next;
				pos--;
			}

			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			newNode.next.prev = newNode;
		}
	}

	void delFirst(){

		if(head == null){

			System.out.println("LinkedList empty");
		}else{

			int count = countNode();

			if(count == 1){
				head = null;
			}else{
				head = head.next;
				head.prev = null;
			}
		}
	}

	void delLast(){

		if(head == null){

			System.out.println("LinkedList empty");
		}else{

			int count = countNode();

			if(count == 1){
				head = null;
			}else{
				Node temp = head;

				while(temp.next != null){

					temp = temp.next;
				}

				temp.prev.next =  null;
				temp.prev = null;   //optional in java, but mandatory in c
			}
		}
	}

	void delAtPos(int pos){

		int count = countNode();

		if(pos <= 0 || pos >= count+1){

			System.out.println("wrong input");
		}else{
			if(pos == 1){
				delFirst();
			}else if(pos == count){
				delLast();
			}else{
			
				Node temp = head;

				while(pos-2 != 0){

					temp = temp.next;
					pos--;
				}

				temp.next = temp.next.next;
				temp.next.prev = temp;
			}
		}
	}

	void printDLL(){

		Node temp = head;

		
		while(temp.next != null){

			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);

		/*System.out.println("node prev                    node data                  node next");

		System.out.println();
		while(temp != null){

			System.out.println(temp.prev + "                     " + temp   +  "                  "  + temp.next);
			temp = temp.next;
		}*/
	}

	void reverseDLL(){

		Node start = head;
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		Node end = temp;

		int len = countNode();

		int i = 1;
		while(i <= len/2){

			int swap = start.data;
			start.data = end.data;
			end.data = swap;
			i++;
			start = start.next;
			end = end.prev;
		}
	}

}
class Client{

	public static void main(String[] args){

		DoublyLinkedList ll = new DoublyLinkedList();

		
		Scanner sc = new Scanner(System.in);

		char ch;

		do{
			System.out.println("LinkedList operations:");
			System.out.println("1. Add First element");
			System.out.println("2. Add Last element");
			System.out.println("3. Add At Position");
			System.out.println("4. Delete First element");
			System.out.println("5. Delete Last element");
			System.out.println("6. Delete At Position");
			System.out.println("7. Count the nodes");
			System.out.println("8. Print Doubly linkedlist");

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
				case 3 : {
						 System.out.println("Enter data to add at position");
					 	 int data = sc.nextInt();
					 	 System.out.println("Enter position");
					 	 int pos = sc.nextInt();
					 	 ll.addAtPos(pos,data);
					 }
					 break;
				case 4 :{
					 	ll.delFirst();
					}
					break;
				case 5 :{
					 	ll.delLast();
					}
					break;
				case 6 :{
					 	 System.out.println("Enter the position");
						 int pos = sc.nextInt();
						 ll.delAtPos(pos);
					}
					break;
				case 7 :{
						 int count = ll.countNode();
						 System.out.println("total nodes = " + count);
					}
					break;
				case 8 :{
						 ll.printDLL();
					}
					break;
				case 9 :{
						ll.reverseDLL();
					}
					break;
				default :{ 
						  System.out.println("invalid input");
					 }
					 break;
			}

			System.out.println("Do you want to continue");
			ch = sc.next().charAt(0);

		}while(ch == 'y' || ch == 'Y');

	}
}





