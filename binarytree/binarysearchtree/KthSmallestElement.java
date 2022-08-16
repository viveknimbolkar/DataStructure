package binarytree.binarysearchtree;

import predefined.TNode;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElement {
    static TNode root;

    int kthSmallest(TNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        getNodes(root,list);

        Collections.sort(list);
        return list.get(k-1);
    }

    void getNodes(TNode root, ArrayList<Integer> nodes){
        if (root == null) return;
        getNodes(root.left, nodes);
        nodes.add(root.data);
        getNodes(root.right, nodes);
    }

    public static void main(String[] args) {
        KthSmallestElement kth = new KthSmallestElement();
        root = new TNode(1);
        root.left = new TNode(2);
        root.left.left = new TNode(4);
        root.left.left.right = new TNode(8);
        root.right = new TNode(3);
        root.right.right = new TNode(7);
        root.right.left = new TNode(6);

        System.out.println("Kth smallest no. "+kth.kthSmallest(root,2));
    }
}
