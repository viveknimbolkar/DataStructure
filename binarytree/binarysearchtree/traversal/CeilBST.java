package binarytree.binarysearchtree.traversal;

import predefined.TNode;

public class CeilBST {
    static TNode root;

    int findCeil(TNode root,int target){
        int ceil = -1;
        while (root != null){
            if (root.data == target){
                ceil = root.data;
                return ceil;
            }
            if (target > root.data) root = root.right;
            else {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
        CeilBST ceil = new CeilBST();

        root = new TNode(8);
        root.left = new TNode(4);
        root.left.left = new TNode(2);
        root.left.right = new TNode(6);
        root.right = new TNode(12);
        root.right = new TNode(14);
        root.right.left = new TNode(10);

        System.out.println(ceil.findCeil(root,11));
    }
}
