package binarytree;

import predefined.TNode;

public class LeavesInBT {
    TNode root;

    int countLeaves(TNode node) {
        if (node == null) return 0;
        int result = 0;
        if (node.left == null && node.right == null) return 1;
        else return countLeaves(node.left) + countLeaves(node.right);
    }

    public static void main(String[] args) {
        LeavesInBT leaves = new LeavesInBT();

        leaves.root = new TNode(1);
        leaves.root.left = new TNode(10);
        leaves.root.left.left = new TNode(5);
        leaves.root.right = new TNode(39);

        System.out.println("Leaves are: "+leaves.countLeaves(leaves.root));
    }
}
