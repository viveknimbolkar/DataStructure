package binarytree;

import predefined.TNode;

// https://www.geeksforgeeks.org/deletion-binary-tree/
public class DeleteBTNode {
    TNode root;

    DeleteBTNode(int data){this.root = new TNode(data);}
    DeleteBTNode(){}


    public static void main(String[] args) {
        DeleteBTNode del = new DeleteBTNode();
        del.root = new TNode(13);
        del.root.left = new TNode(12);
        del.root.left.left = new TNode(4);
        del.root.right = new TNode(10);
        del.root.right.left = new TNode(16);
        del.root.right.right = new TNode(9);

        del.root.inorder(del.root);
    }
}
