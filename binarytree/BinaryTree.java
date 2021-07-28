package binarytree;
/*
 *    	 Node
 *    	 /  \
 *    	/	 \
 * left ptr  right ptr
 */

//create a Blueprint for a single node
class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data=data;
		left = right = null;	
	}
}

public class BinaryTree {
	
	Node root; //create a root node
	
	//constructor for node
	BinaryTree(int data) {
		this.root = new Node(data);
	 }
	 //constructor for root node
	 BinaryTree(){
		 this.root = null;
	 }

	 //Traversal techniques
	//Inorder traversal i.e. from left bottom node to the right bottom node through root node
	public void inorderTraversal(Node node){
	 	if (root == null)
	 		return;
	 	inorderTraversal(root.left);
		System.out.println(root.data + " is a root");
		inorderTraversal(root.right);
	}

	public void preorderTraversal(Node node){
		if (root == null)
			return;
		System.out.println(root.data+" is a root");
		preorderTraversal(root.left);
		preorderTraversal(root.right);
	}

	public void postorderTraversal(Node node){
		if (root == null)
			return;
		postorderTraversal(root.left);
		postorderTraversal(root.right);
		System.out.println(root.data+" is a root");

	}

	//check if it is a full binary tree or not
	public boolean isFullBinaryTree(Node node){
		//if the root node has no child node
		if (node == null)
			return true;

		//if the left and right node has no child nodes
		if (node.left == null && node.right == null)
			return true;

		//if the left and right node has parent nodes
		if ((node.left != null) && (node.right != null))
			//check for the left and right child subtree
			return (isFullBinaryTree(node.left) && isFullBinaryTree(node.right));

		return false;
	}

	//check for the perfect binary tree
	 static boolean isPerfectBinaryTree(Node root,int depth, int level){
		//check if root node is empty
		if (root == null)
			return true;

		//check the child of root node
		if (root.left == null && root.right == null)
			return true;

		//if any node has null child then set false
		if (root.left == null || root.right == null)
			return false;
		//check from the both subtree i.e. left and right if they are same then return && logic o/p
		return (isPerfectBinaryTree(root.left,depth,level+1) && isPerfectBinaryTree(root.right,depth,level+1));
	}

	//shortcut of perfectbinary tree
	 static boolean isPerfectBinaryTree(Node root){
		int depth = getDepthOfBT(root);
		int level = 0;
		return isPerfectBinaryTree(root, depth, level);
	}

	//get the depth of the binary Tree
	public static int getDepthOfBT(Node rootNode){
		int depth = 0;
		while (rootNode.left != null){
			depth++;
			rootNode = rootNode.left;
		}
		return depth;
	}

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(12);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(5);

		System.out.println(isPerfectBinaryTree(tree.root));
	}

}


















