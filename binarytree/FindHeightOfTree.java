package binarytree;
// https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/

public class FindHeightOfTree {
    static class TNode{
        int root;
        TNode left,right;
        TNode(int data){this.root = data;left=right=null;}
        TNode(){}
    }

    TNode node;
    int findHeightOfTree(TNode n){
        if (n == null) return -1;
        return  Math.max(findHeightOfTree(n.left),findHeightOfTree(n.right));
    }

    public static void main(String[] args) {
        FindHeightOfTree find = new FindHeightOfTree();
        TNode node = new TNode();

    }
}
