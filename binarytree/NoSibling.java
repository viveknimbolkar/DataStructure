package binarytree;

import predefined.TNode;

import java.util.ArrayList;
import java.util.Collections;

//https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1
public class NoSibling {
    static TNode root;

    ArrayList<Integer> noSibling(TNode root) {
        ArrayList<Integer> nodesHavingNoSibling = new ArrayList<>();
        // if tree is empty
        if (root == null) return nodesHavingNoSibling;
        findNodes(root,nodesHavingNoSibling);
        Collections.sort(nodesHavingNoSibling);
        if (nodesHavingNoSibling.size() < 1) nodesHavingNoSibling.add(-1);
        return nodesHavingNoSibling;
    }

    ArrayList<Integer> findNodes(TNode root, ArrayList<Integer> list){
        if (root == null) return list;
        if (root.left != null && root.right == null) list.add(root.left.data);
        if (root.left == null && root.right != null) list.add(root.right.data);
        findNodes(root.left,list);
        findNodes(root.right,list);
        return list;
    }

    public static void main(String[] args) {
        NoSibling nosib = new NoSibling();

        root = new TNode(37);
        root.left = new TNode(20);
        root.left.left = new TNode(113);

        System.out.println(nosib.noSibling(root));
    }
}
