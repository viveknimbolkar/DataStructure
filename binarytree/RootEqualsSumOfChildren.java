package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/root-equals-sum-of-children/
public class RootEqualsSumOfChildren {
    TNode root;

    boolean checkTree(TNode root) {
        return root.data == root.left.data + root.right.data;
    }

    public static void main(String[] args) {
        RootEqualsSumOfChildren r = new RootEqualsSumOfChildren();

        r.root = new TNode(10);
        r.root.left = new TNode(4);
        r.root.right = new TNode(6);

        System.out.println("Is equal sum: "+r.checkTree(r.root));
    }
}
