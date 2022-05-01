package binarytree;

import predefined.TNode;

public class CheckForBalanceTree {
    TNode node;

    boolean isBalanced(TNode node){
        int leftHeight , rightHeight;
        if (node == null) return false;
        leftHeight = height(node.left);
        rightHeight = height(node.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right))
            return true;

        return false;
    }

    int height(TNode root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public static void main(String[] args) {
        CheckForBalanceTree check = new CheckForBalanceTree();
        TNode n = new TNode();

        n = new TNode(10);
        n.left = new TNode(20);
        n.left.left = new TNode(40);
        n.left.right = new TNode(60);
        n.right = new TNode(30);

        n.inorder(n);
        System.out.println("Is balance tree: "+check.isBalanced(n));
    }
}
