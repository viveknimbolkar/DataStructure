package binarytree;

import predefined.TNode;

public class FindNthNodeUsingPostorder {

    TNode root;

    int count = 0;
    public static void main(String[] args) {
        FindNthNodeUsingPostorder findPostorder = new FindNthNodeUsingPostorder();
        findPostorder.root = new TNode(11);
        findPostorder.root.left = new TNode(21);
        findPostorder.root.right = new TNode(31);
        findPostorder.root.left.left = new TNode(41);
        findPostorder.root.left.right = new TNode(51);

        findPostorder.root.inorder(findPostorder.root);
    }
}
