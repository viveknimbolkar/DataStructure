package binarytree;
// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/

import predefined.TNode;

public class FindHeightOfTree {

    static TNode root;
    int findHeightOfTree(TNode n){
        if (n == null) return -1;
        int left = findHeightOfTree(n.left);
        int right = findHeightOfTree(n.right);
        if (left > right) return left+1;
        else return right+1;
    }

    public static void main(String[] args) {
        FindHeightOfTree find = new FindHeightOfTree();

        root = new TNode(10);
        root.left = new TNode(20);
        root.left.left = new TNode(40);
        root.left.left.left = new TNode(5);
        root.left.right = new TNode(0);
        root.right = new TNode(176);

        System.out.println("Height is: "+find.findHeightOfTree(root));
    }
}
