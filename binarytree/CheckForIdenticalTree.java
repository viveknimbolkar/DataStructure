package binarytree;

import predefined.TNode;

import java.util.ArrayList;

//https://practice.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
public class CheckForIdenticalTree {
    static TNode tree1, tree2;

    // method-1: using recursion (easy method)
    boolean isIdentical(TNode root1, TNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null || root1.data != root2.data) return false;
        return isIdentical(root1.left,root2.left) && isIdentical(root2.right,root2.right);
    }

    // method-2: using extra space
    boolean isIdentical2(TNode root1, TNode root2){
        // inorder list of tree
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        getNodes(root1,list1);
        getNodes(root2,list2);

        if (list2.size() != list1.size())
            return false;

        // comparing the elements of both nodes
        for (int i = 0; i < list1.size()-1; i++)
            if (list1.get(i) != list2.get(i))
                return false;

        return true;
    }

    void getNodes(TNode root, ArrayList<Integer> nodes){
        if (root == null) return;
        getNodes(root.left,nodes);
        nodes.add(root.data);
        getNodes(root.right,nodes);
    }

    public static void main(String[] args) {
        CheckForIdenticalTree check = new CheckForIdenticalTree();

        tree1 = new TNode(10);
        tree1.left = new TNode(20);
        tree1.left.left = new TNode(40);
        tree1.left.left.left = new TNode(5);
        tree1.left.right = new TNode(0);
        tree1.right = new TNode(176);

        tree2 = new TNode(10);
        tree2.left = new TNode(20);
        tree2.left.left = new TNode(40);
        tree2.left.left.left = new TNode(5);
        tree2.left.right = new TNode(0);
        tree2.right = new TNode(176);

        System.out.println("Is identical: "+check.isIdentical(tree1,tree2));
    }
}
