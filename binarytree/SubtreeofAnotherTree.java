package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/subtree-of-another-tree/
public class SubtreeofAnotherTree {

    static TNode tree, subtree;

    boolean isSubtree(TNode root, TNode subRoot) {
        if (root == null) return false;
        if (root.data == subRoot.data){
            TNode temp = root;
            if (isIdenticalTree(temp,subRoot)) return true;
        }

        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    boolean isIdenticalTree(TNode root, TNode subtree){
        if (root == null && subtree == null) return true;
        if (root == null || subtree == null) return false;
        // the moment node of both trees not matched return false
        if (root.data != subtree.data) return false;
        // move left and right subtree
        return isIdenticalTree(root.left,subtree.left) &&
                isIdenticalTree(root.right,subtree.right);
    }



    public static void main(String[] args) {
        SubtreeofAnotherTree sub = new SubtreeofAnotherTree();

        tree = new TNode(3);
        tree.left = new TNode(4);
        tree.left.left = new TNode(1);
        tree.right = new TNode(5);

        subtree = new TNode(4);
        subtree.left = new TNode(1);
        subtree.right = new TNode(2);

        System.out.println("Is subtree found: "+sub.isSubtree(tree,subtree));
    }
}
