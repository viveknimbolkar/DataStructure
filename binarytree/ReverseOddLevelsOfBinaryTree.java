package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/
public class ReverseOddLevelsOfBinaryTree {
    TNode root;
    TNode reverseOddLevels(TNode root) {
        traverse(root.left,root.right,1);
        return root;
    }

    void traverse(TNode node1, TNode node2, int level){
        if (node1 == null || node2 == null) return;

        // if the level is odd
        if (level%2 == 1){
            // swap the nodes
            int temp = node1.data;
            node1.data = node2.data;
            node2.data = temp;
        }
        traverse(node1.left, node2.right,level+1);
        traverse(node1.right, node2.left,level+1);
    }

    public static void main(String[] args) {
        ReverseOddLevelsOfBinaryTree revodd = new ReverseOddLevelsOfBinaryTree();
        revodd.root = new TNode(2);
        revodd.root.left = new TNode(3);
        revodd.root.left.left = new TNode(8);
        revodd.root.left.right = new TNode(13);

        revodd.root.right = new TNode(5);
        revodd.root.right.left = new TNode(21);
        revodd.root.right.right = new TNode(34);
        System.out.println("Before reverse: ");
        revodd.root.inorder(revodd.root);

        System.out.println("\n After reverse: ");
        revodd.root.inorder(revodd.reverseOddLevels(revodd.root));
    }
}
