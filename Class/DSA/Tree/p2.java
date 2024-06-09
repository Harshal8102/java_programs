//Constrcut Binary tree from an array

import java.util.*;
class TreeNode{

	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){

		this.data = data;
		left = right = null;
	}
}
class BinaryTree{

	int index = -1;
	TreeNode constructBT(int nodes[]){

		index++;

		if(nodes[index] == -1){
			return null;
		}

		TreeNode newNode = new TreeNode(nodes[index]);
		newNode.left = constructBT(nodes);
		newNode.right = constructBT(nodes);
	
		return newNode;
	}

	int countTreeNodes(TreeNode root){

		if(root == null)
			return 0;

		int countOfLST = countTreeNodes(root.left);
		int countOfRST = countTreeNodes(root.right);

		return countOfLST + countOfRST + 1;
	}

	int sumOfTreeNodes(TreeNode root){

		if(root == null)
			return 0;

		int sumOfLST = sumOfTreeNodes(root.left);
		int sumOfRST = sumOfTreeNodes(root.right);

		return sumOfLST + sumOfRST + root.data;
	}

	int heightOfTree(TreeNode root){

		if(root == null)
			return 0;

		int countLST = heightOfTree(root.left);
		int countRST = heightOfTree(root.right);

		return Math.max(countLST,countRST) + 1;
	}


	void inOrder(TreeNode root){

		if(root == null){
			return;
		}

		System.out.println(root.data);
		inOrder(root.left);
		inOrder(root.right);
	}
	

	void levelOrder(TreeNode root){


		Queue<TreeNode> que = new LinkedList<>();

		que.add(root);

		while(!que.isEmpty()){

			TreeNode tempNode = que.remove();
			
			System.out.print(tempNode.data + "  ");

			if(tempNode.left != null)
				que.add(tempNode.left);
			if(tempNode.right != null){
				que.add(tempNode.right);
			}
		}
		System.out.println();
	}

	void advanceLevelOrder(TreeNode root){

		Queue<TreeNode> que = new LinkedList<>();

		que.add(root);
		que.add(null);

		while(!que.isEmpty()){

			TreeNode tempNode = que.remove();

			if(tempNode == null){

				System.out.println();

				if(que.isEmpty()){
					break;
				}else{
					que.add(null);
				}
			}else{

				System.out.print(tempNode.data + "  ");

				if(tempNode.left != null)
					que.add(tempNode.left);

				if(tempNode.right != null)
					que.add(tempNode.right);
			}
		}
	}


	public static void main(String[] args){

		BinaryTree obj = new BinaryTree();

		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,7,-1,-1};

		TreeNode root = null;
		root = obj.constructBT(nodes);

		obj.inOrder(root);

		System.out.println("count of nodes : " + obj.countTreeNodes(root));
		System.out.println("sum of tree nodes : " + obj.sumOfTreeNodes(root));
		System.out.println("height of tree : " + obj.heightOfTree(root));

		System.out.println("level order traversal");
		obj.levelOrder(root);
		System.out.println("advance level order traversal");
		obj.advanceLevelOrder(root);
	}
}
