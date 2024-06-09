
import java.util.*;
class Node{

	int data;
	Node left;
	Node right;

	Node(int data){

		this.data = data;
		left = right = null;
	}
}

class BinaryTree{

	Scanner sc = new Scanner(System.in);

	Node constructBT(){

		System.out.println("Enter data of node");
		int data = sc.nextInt();

		Node newNode = new Node(data);

		System.out.println("Do u want to enter node at left side of node " + newNode.data);
		char left = sc.next().charAt(0);
		if(left == 'y' || left == 'Y'){
			newNode.left = constructBT();
		}

		System.out.println("Do u want to enter node at right side of node " + newNode.data);
		char right = sc.next().charAt(0);
		if(right == 'y' || right == 'Y'){
			newNode.right = constructBT();
		}

		return newNode;
	}
		
	void preOrderBT(Node root){

		if(root == null)
			return;

		System.out.println(root.data);
		preOrderBT(root.left);
		preOrderBT(root.right);
	}

	void inOrderBT(Node root){

		if(root == null)
			return;

		inOrderBT(root.left);
		System.out.println(root.data);
		inOrderBT(root.right);
	}

	void  postOrderBT(Node root){

		if(root == null)
			return;

		postOrderBT(root.left);
		postOrderBT(root.right);
		System.out.println(root.data);
	}

	public static void main(String[] args){

		Node root = null;

		BinaryTree obj = new BinaryTree();
		root = obj.constructBT();

		System.out.println("preOrder tree traversal");
		obj.preOrderBT(root);;

		System.out.println("InOrder tree traversal");
		obj.inOrderBT(root);

		System.out.println("postOrder tree traversal");
		obj.postOrderBT(root);

	}
}

