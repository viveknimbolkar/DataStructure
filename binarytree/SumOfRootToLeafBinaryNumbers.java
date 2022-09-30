package binarytree;

import predefined.TNode;

import java.util.ArrayList;

//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
public class SumOfRootToLeafBinaryNumbers {

    static TNode root;

    int sumRootToLeaf(TNode root) {
        return findSumOfAll(root,0);
    }

    // get the path from root to leaf (all paths)
    int findSumOfAll(TNode root, int sum){
        if (root== null) return 0;
        sum = (2*sum)+root.data; // base 2 binary (so, multiply by 2)

        if (root.left == null && root.right == null){
            return sum;
        }
        return findSumOfAll(root.left,sum)+findSumOfAll(root.right,sum);
    }

    public static void main(String[] args) {
        SumOfRootToLeafBinaryNumbers sumof = new SumOfRootToLeafBinaryNumbers();
        root = new TNode(1);
        root.left = new TNode(0);
        root.left.left = new TNode(0);
        root.left.right= new TNode(1);
        root.right = new TNode(1);
        root.right.left = new TNode(0);
        root.right.right = new TNode(1);

        System.out.println(sumof.sumRootToLeaf(root));
    }
}
