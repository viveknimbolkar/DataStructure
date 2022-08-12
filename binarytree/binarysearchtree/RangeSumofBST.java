package binarytree.binarysearchtree;

import predefined.TNode;

//https://leetcode.com/problems/range-sum-of-bst/
public class RangeSumofBST {
    TNode root;

    // Using dfs algorithm
    int rangeSumBST(TNode root, int low, int high) {
        if (root == null) return 0;

        // is the node lies between low to high move then,
        // move recursively left and right with adding current node sum
        if (low <= root.data && root.data <= high){
            return root.data + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        }else{
            return rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
        }
    }

    public static void main(String[] args) {
        RangeSumofBST sum = new RangeSumofBST();

        sum.root = new TNode(10);
        sum.root.left = new TNode(5);
        sum.root.left.left = new TNode(3);
        sum.root.left.right = new TNode(7);
        sum.root.left.right.left = new TNode(6);


        sum.root.right = new TNode(15);
        sum.root.right.right = new TNode(18);
        sum.root.right.left = new TNode(13);

        System.out.println("Range sum is: "+sum.rangeSumBST(sum.root,7,15));
    }
}
