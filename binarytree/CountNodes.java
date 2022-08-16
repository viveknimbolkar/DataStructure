package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/count-complete-tree-nodes/
public class CountNodes {
static TNode root;
    int count = 0;
    int countNodes(TNode root) {
        if(root == null) return count;
        countNodes(root.left);
        count = count+1;
        countNodes(root.right);
        return count;
    }

    public static void main(String[] args) {
        CountNodes count = new CountNodes();

        root = new TNode(10);
        root.left = new TNode(20);
        root.left.left = new TNode(40);
        root.left.left.left = new TNode(5);
        root.left.right = new TNode(0);
        root.right = new TNode(176);

        System.out.println("total Nodes: "+count.countNodes(root));
    }
}
