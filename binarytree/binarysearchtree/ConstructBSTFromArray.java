package binarytree.binarysearchtree;

import predefined.TNode;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ConstructBSTFromArray {

    TNode sortedArrayToBST(int[] nums) {
        //if array is empty that means no tree can be constructed
        if (nums.length == 0) return null;
        return constructTree(nums,0,nums.length-1);
    }

    //Using binary search
    TNode constructTree(int[] nums,int left, int right){
        // consider the mid of the array as the root of the binary tree
        if (left > right) return null;
        int mid = left +(right-left)/2;

        // create a root node having mid of a array as root point
        TNode node = new TNode(nums[mid]);

        // move to the tree left and right
        node.left = constructTree(nums,left,mid-1);
        node.right = constructTree(nums,mid+1,right);

        return node;
    }

    public static void main(String[] args) {
        ConstructBSTFromArray cons = new ConstructBSTFromArray();
        TNode tree = new TNode();
        int[] nums = {-10,-3,0,5,9};

        tree.inorder(cons.sortedArrayToBST(nums));
    }
}
