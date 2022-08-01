package binarytree.binarysearchtree;

import predefined.TNode;

//https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumofBST {
    TNode root;

    int rangeSumBST(TNode root, int low, int high) {
        if (root == null) return 0;
        else if (root.data < low)
            rangeSumBST(root.right,low,high);
        else if (root.data > high)
            rangeSumBST(root.left,low,high);

        return root.data + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
    }

    public static void main(String[] args) {
        RangeSumofBST sum = new RangeSumofBST();

        sum.root = new TNode(10);
        sum.root.left = new TNode(5);
        sum.root.left.left = new TNode(3);


        sum.root.right = new TNode(15);
        sum.root.right.right = new TNode(18);

        System.out.println("Range sum is: "+sum.rangeSumBST(sum.root,7,15));
    }
}
