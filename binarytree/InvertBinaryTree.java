package binarytree;

import predefined.TNode;

public class InvertBinaryTree {
    TNode root;
    TNode invertTree(TNode root) {
        if(root == null) return null;
        invertTree(root.left);
        invertTree(root.right);

        // swap left node with right
        TNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree invert = new InvertBinaryTree();

        invert.root = new TNode(4);
        invert.root.left = new TNode(2);
        invert.root.right = new TNode(7);
        invert.root.right.left = new TNode(6);
        invert.root.right.right = new TNode(9);
        invert.root.left.left = new TNode(1);
        invert.root.left.right = new TNode(3);

        invert.root.inorder(invert.invertTree(invert.root));
    }
}
