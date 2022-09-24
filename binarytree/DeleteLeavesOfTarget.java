package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/delete-leaves-with-a-given-value/
public class DeleteLeavesOfTarget {
    static TNode root;

    TNode removeLeafNodes(TNode root, int target) {
        if (root == null) return root;

        root.left = removeLeafNodes(root.left,target);
        root.right = removeLeafNodes(root.right,target);

        if (root.left == null && root.right == null && root.data == target)
            root = null;

        return root;
    }


    public static void main(String[] args) {
        DeleteLeavesOfTarget del = new DeleteLeavesOfTarget();

        root = new TNode(1);
        root.left = new TNode(2);
        root.left.left = new TNode(2);
        root.right = new TNode(3);
        root.right.left = new TNode(2);
        root.right.right = new TNode(4);

        root.inorder(root);
    }
}
