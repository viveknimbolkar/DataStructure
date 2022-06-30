package binarytree;

import predefined.TNode;

// https://www.youtube.com/watch?v=WszrfSwMz58&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=18
public class MaxPathSum {
    TNode root;

    int maxPathSum(TNode root){
        int[] maxValue = new int[1];
        maxPathFromEachNode(root,maxValue);
        return maxValue[0];
    }

    // calculate the maxi path from each and every node
    int maxPathFromEachNode(TNode root, int[] maxi){
        // if we reached at the end of node return 0
        if (root == null) return 0;

        int leftSum = Math.max(0,maxPathFromEachNode(root.left,maxi));
        int rightSum = Math.max(0,maxPathFromEachNode(root.right,maxi));
        maxi[0] = Math.max(maxi[0],leftSum+rightSum+root.data);

        return root.data+Math.max(leftSum,rightSum);
    }

    // Method-2
    int util(TNode root, int[] result){
        if(root == null) return 0;

        int lSum = util(root.left,result);
        int rSum = util(root.right,result);
        int count = root.data;

        // find out the max from left and right in count
        count = Math.max(count,root.data+lSum);
        count = Math.max(count,root.data+rSum);
        count = Math.max(count,lSum+rSum+root.data);

        //configure the final count value
        if(count > result[0]) result[0] = count;
        return Math.max(root.data, Math.max(root.data+lSum,root.data+rSum));
    }

    public static void main(String[] args) {
        MaxPathSum max = new MaxPathSum();

        max.root  = new TNode(-10);
        max.root.left = new TNode(9);
        max.root.right = new TNode(20);
        max.root.right.left = new TNode(15);
        max.root.right.right = new TNode(7);

        System.out.println(max.maxPathSum(max.root));
    }
}
