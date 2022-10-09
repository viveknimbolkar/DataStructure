package binarytree;

import predefined.TNode;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
public class TargetSumNodes {
    static TNode root;
    Set<Integer> set = new HashSet<>();
    boolean findTarget(TNode root, int k) {
        if (root == null) return false;
        // if we found required number to make k equal
        if (set.contains(k-root.data))
            return true;
        // else add every node into set for further use
        set.add(root.data);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }


    public static void main(String[] args) {
        TargetSumNodes tsum = new TargetSumNodes();
        root = new TNode(5);
        root.left = new TNode(3);
        root.left.left = new TNode(2);
        root.left.right = new TNode(4);
        root.right = new TNode(6);
        root.right.right = new TNode(7);

        System.out.println(tsum.findTarget(root,9));
    }
}
