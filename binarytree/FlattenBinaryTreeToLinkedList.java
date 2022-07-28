package binarytree;

import predefined.TNode;

import java.util.ArrayList;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class FlattenBinaryTreeToLinkedList {
    TNode root;
    TNode prev = null;
    void flatten(TNode root) {
        if (root == null) return;
        flatten(root.right);
        flatten(root.left);
        // set the last element of right of bt to null
        root.left = null;
        // start adding node to the head of the ll
        root.right = prev;
        // move to left and make current as prev
        prev = root;
    }

    public static void main(String[] args) {
        FlattenBinaryTreeToLinkedList flat = new FlattenBinaryTreeToLinkedList();

        flat.root  = new TNode(1);
        flat.root.left = new TNode(2);
        flat.root.left.left = new TNode(3);
        flat.root.left.right = new TNode(4);
        flat.root.right = new TNode(5);
        flat.root.right.right = new TNode(6);

        flat.flatten(flat.root);
        flat.root.inorder(flat.root);
    }
}
