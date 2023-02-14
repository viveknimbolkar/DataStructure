package revision.binarytree;

import predefined.TNode;

public class CheckForBST {

    public static void main(String[] args) {
        CheckForBST check = new CheckForBST();
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.right = new TNode(4);
        root.left.left = new TNode(5);
        System.out.println(check.isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }

    private boolean isBST(TNode root,int minval, int maxval) {
        if(root == null) return true;
       if (root.data <= minval || root.data >= maxval) return false;
        return isBST(root.left,minval,root.data) && isBST(root.right, root.data,maxval);
    }
}
