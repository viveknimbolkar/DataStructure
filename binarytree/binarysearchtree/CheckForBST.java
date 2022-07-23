package binarytree.binarysearchtree;

import predefined.TNode;

// https://practice.geeksforgeeks.org/problems/check-for-bst/1/
public class CheckForBST {
    TNode root;
    CheckForBST(int data){this.root = new TNode(data);}
    CheckForBST(){};

    boolean isValidBST(TNode n){
        return isValidBST(n,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    boolean isValidBST(TNode n, long minVal, long maxVal){
        if (n == null) return true; // is we reach to the end of subtree
        if (n.data <= minVal || n.data >= maxVal) return false; // is root node is greater or smaller than min and max
        // checking whether every subtree of a tree is valid or not and return the true or false of each subtree
        return isValidBST(n.left,minVal,n.data) && isValidBST(n.right,n.data,maxVal);
    }

    public static void main(String[] args) {
        CheckForBST check = new CheckForBST();
        check.root = new TNode(13);
        check.root.left = new TNode(10);
        check.root.left.left = new TNode(7);
        check.root.left.right = new TNode(12);
        check.root.left.left.right = new TNode(9);
        check.root.left.left.right.left = new TNode(8);
        check.root.right = new TNode(15);
        check.root.right.left = new TNode(14);
        check.root.right.right = new TNode(17);
        check.root.right.right.left = new TNode(50);

        System.out.println(check.isValidBST(check.root));
    }
}
