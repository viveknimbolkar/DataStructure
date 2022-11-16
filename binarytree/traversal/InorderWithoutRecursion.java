package binarytree.traversal;
// O(n)
import predefined.TNode;

import java.util.Stack;

public class InorderWithoutRecursion {
    TNode root;

    void inorderTraversalWithoutRecursion(){
        if (root == null) return;
        //store current node in stack DS
        Stack<TNode> stack = new Stack<>();
        TNode currentNode = root;
        //traverse the stack ds
        while (currentNode != null || stack.size() > 0){
            //reach out the left most node
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop(); // last node should be null
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.right; // go to the right child node
        }
    }

    public static void main(String[] args) {
        InorderWithoutRecursion iwr = new InorderWithoutRecursion();
        iwr.root = new TNode(1);
        iwr.root.left = new TNode(2);
        iwr.root.right = new TNode(3);
        iwr.root.left.left = new TNode(4);
        iwr.root.left.right = new TNode(5);

        iwr.inorderTraversalWithoutRecursion();

    }
}
