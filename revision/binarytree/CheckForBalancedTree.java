package revision.binarytree;

import predefined.TNode;

public class CheckForBalancedTree {

    boolean isBalanced(TNode root) {
       return height(root) != -1;
    }

    int height(TNode root){
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

       if (leftHeight == -1 || rightHeight == -1) return -1;
       if (Math.abs(leftHeight-rightHeight) > 1) return -1;
       return Math.max(leftHeight,rightHeight)+1;

    }

    public static void main(String[] args) {
        CheckForBalancedTree check = new CheckForBalancedTree();

        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.left.left = new TNode(4);
        root.left.right = new TNode(3);
        root.left.right.left = new TNode(6);
        root.right = new TNode(3);

        System.out.println(check.isBalanced(root));
    }
}
