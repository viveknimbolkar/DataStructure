package binarytree;

import predefined.TNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

//https://leetcode.com/problems/sum-of-left-leaves/
public class SumofLeftLeaves {
    static TNode root;

    int sumOfLeftLeaves(TNode root) {
        if (root == null) return 0;
        int sum = 0;
        // if current node have left node
        if (root.left != null){
            // check for the leaf node of every left node
            if (root.left.left == null && root.left.right == null){
                sum += root.left.data;
            }else {
                // if the current node is not a leaf node then recursively go to left
                sum += sumOfLeftLeaves(root.left);
            }
        }
        // go to the right subtree and findout the left leaf nodes
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }


    public static void main(String[] args) {
        SumofLeftLeaves sum = new SumofLeftLeaves();

        root = new TNode(3);
        root.left = new TNode(9);
        root.right = new TNode(20);
        root.right.left = new TNode(7);
        root.right.right = new TNode(15);

        System.out.println("Sum of left leaves: "+sum.sumOfLeftLeaves(root));
    }
}
