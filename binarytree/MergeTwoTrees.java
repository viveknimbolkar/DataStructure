package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/merge-two-binary-trees/
public class MergeTwoTrees {
    static TNode root1, root2;

    TNode mergeTwoTrees(TNode root1,TNode root2){
        if (root1 == null) return root2;
        if (root1 == null) return root1;

        if (root1 != null && root2 != null){
            // add val of node2 into node1
            root1.data += root2.data;
            root1.left = mergeTwoTrees(root1.left,root2.left);
            root1.right = mergeTwoTrees(root1.right,root2.right);
        }
        return root1;
    }

    public static void main(String[] args) {
        MergeTwoTrees merge = new MergeTwoTrees();

        // first tree
        root1 = new TNode(4);
        root1.left = new TNode(2);
        root1.right = new TNode(7);
        root1.right.left = new TNode(6);
        root1.right.right = new TNode(9);
        root1.left.left = new TNode(1);
        root1.left.right = new TNode(3);

        //second tree
        root2 = new TNode(10);
        root2.left = new TNode(11);
        root2.left.left = new TNode(7);
        root2.right = new TNode(9);
        root2.right.right = new TNode(8);
        root2.right.left = new TNode(15);

        root1.inorder(merge.mergeTwoTrees(root1,root2));
    }
}
