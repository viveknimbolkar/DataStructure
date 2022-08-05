package binarytree;

import predefined.TNode;

import java.util.ArrayList;

//https://leetcode.com/problems/univalued-binary-tree/
public class UnivaluedBinaryTree {
    static TNode root;
    int firstVal = 0;
    boolean flag = true;
    boolean isUnivalTree(TNode root) {
      if (root == null) return flag;
      firstVal = root.data;
      traverse(root);
      return flag;
    }

    // preorder traversal and parallely checking for same values
    void traverse(TNode root){
        if (root == null) return;
        // every time check for firstval and current node data
        if (firstVal != root.data) flag = false;
        traverse(root.left);
        traverse(root.right);
    }

    public static void main(String[] args) {
        UnivaluedBinaryTree uni = new UnivaluedBinaryTree();
        root = new TNode(1);
        root.left = new TNode(1);
        root.left.left = new TNode(1);
        root.left.right = new TNode(1);

        root.right = new TNode(1);
        root.right.right = new TNode(1);

        System.out.println(uni.isUnivalTree(root));
    }
}
