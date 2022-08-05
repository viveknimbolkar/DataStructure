package binarytree;

import predefined.TNode;

import java.util.ArrayList;

//https://leetcode.com/problems/increasing-order-search-tree/
public class IncreasingOrderSearchTree {
    static TNode root;
    ArrayList<Integer> list = new ArrayList<>();

    TNode increasingBST(TNode root) {
        inorder(root);
        // create a cloned list and add elements step by step
        TNode head = new TNode(0);
        TNode clone = head;

        // threading right of binary tree
        for (int i = 0; i < list.size(); i++) {
            TNode temp = new TNode(list.get(i));
            clone.right = temp;
            clone = clone.right;
        }
     return head;
    }


// store all the nodes in list
    ArrayList<Integer> inorder(TNode node){
        if (node == null) return list;
        inorder(node.left);
        list.add(node.data);
        inorder(node.right);
        return list;
    }



    public static void main(String[] args) {
        IncreasingOrderSearchTree inc = new IncreasingOrderSearchTree();
        root = new TNode(5);
        root.left = new TNode(3);
        root.left.left = new TNode(2);
        root.left.right = new TNode(4);
        root.left.left.left = new TNode(1);

        root.right = new TNode(6);
        root.right.right = new TNode(8);
        root.right.right.right = new TNode(9);
        root.right.right.left = new TNode(7);

        System.out.println(inc.increasingBST(root).data);
    }
}
