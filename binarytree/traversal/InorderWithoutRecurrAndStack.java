package binarytree.traversal;
/*
https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/

     1
   /   \
  2     3
 / \   /
4   5 6

 */

import predefined.TNode;

public class InorderWithoutRecurrAndStack {

    TNode root;

    void inorderTraversalWithoutRecursionAndStack(TNode node){
        if (node == null) return; //if the tree is empty
        TNode current , previous;
        current = node;
        //now traverse through the list upto current != null
        while (current != null){
            if (current.left == null){
                System.out.print(current.data+" ");
                current = current.right;
            }else {
                //Find the inorder predecessor of current node i.e. right last most element of the node
                previous = current.left;
                while (previous.right != null && previous.right != current)
                    previous = previous.right;

                // make current as the right child of righ last most precedecessor
                if (previous.right == null){
                    previous.right = current;
                    current = current.left;
                }else {
                    previous.right = null;
                    System.out.print(current.data+" ");
                    current = current.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        InorderWithoutRecurrAndStack iwras = new InorderWithoutRecurrAndStack();
        iwras.root = new TNode(1);
        iwras.root.left = new TNode(2);
        iwras.root.right = new TNode(3);
        iwras.root.left.left = new TNode(4);
        iwras.root.left.right = new TNode(5);
        iwras.root.right.left = new TNode(6);

        iwras.inorderTraversalWithoutRecursionAndStack(iwras.root);
    }
}
