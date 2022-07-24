package binarytree.binarysearchtree;

import predefined.TNode;

public class ValidBST {
    TNode root;
    boolean isValidBST(TNode root) {
        return util(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    boolean util(TNode root,long min, long max){
        if(root == null) return true;
        if(root.data >= max || root.data <= min) return false;
        return false;
//        return isValidBST(root.left, min,root.data) && isValidBST(root.right,root.data,max);
    }

    public static void main(String[] args) {
        ValidBST valid = new ValidBST();

        valid.root = new TNode(6);
        valid.root.left = new TNode(2);
        valid.root.right = new TNode(8);
        valid.root.left.left = new TNode(0);
        valid.root.left.right = new TNode(4);
        valid.root.left.right.left = new TNode(3);
        valid.root.left.right.right = new TNode(5);
        valid.root.right.left = new TNode(7);
        valid.root.right.right = new TNode(9);

        System.out.println(valid.isValidBST(valid.root));
    }
}
