
import java.util.*;
class Node{

	int data;
	Node next = null;

	Node(int data){

		this.data = data;
	}
	int flag = 0;
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

			System.out.print(head.data  + "   ");
			head = head.next;
		}
		System.out.println();
	}
	int countNode(Node head){
		int count = 0;
		while(head != null){
			count++;
			head = head.next;
		}
		return count;
	}
	Node rotateRight(Node head,int k){

		int count = countNode(head);

		if(count!=0 && k >count){
			k = k%count;
		}

		if(k==0 || k == count || head == null){
			return head;
		}

		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;

		k = count-k;

		while(k != 0){
			temp = temp.next;
			k--;
		}
		head = temp.next;
		temp.next = null;
		return head;
	}

	Node rotateLeft(Node head,int k){
	
		count = countNode(head);

		if(k > count && count!=0){
			k = k%count;
		}
		if(k == 0 || k == count || head == null){
			return head;
		}

		Node temp = head;
		Node p_temp = null;
		while(k != 0 && temp != null){
			k--;
			p_temp = temp;
			temp = temp.next;
		}
		p_temp.next = null;
		p_temp = temp;
		while(temp.next != null)
			temp = temp.next;

		temp.next = head;
		return p_temp;

	}
	boolean detectLoop(Node head){

		while(head!=null){

			if(head.flag == 1){
				return true;
			}

			head.flag = 1;
			head = head.next;
		}
		return false;
	}
	void removeLoop(Node head){

		HashSet<Node> set = new HashSet<>();

		set.add(head);
		while(head != null){

			if(set.contains(head.next)){
				head.next = null;
				break;
			}

			set.add(head.next);
			head = head.next;
		}
	}

}
