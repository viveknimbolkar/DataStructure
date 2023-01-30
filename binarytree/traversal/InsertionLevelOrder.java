package binarytree.traversal;

import predefined.TNode;

import java.util.LinkedList;
import java.util.Queue;

public class InsertionLevelOrder {
    static TNode root;
    
    public static void main(String[] args) {
        root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);
        root.left.right = new TNode(5);
        root.right.right = new TNode(6);
        // insert node at the minimum level where empty space is present
        insert(root, 10);
        root.inorder(root);
    }

    /* 3 case:
               1. find left null children and add into that position
               2. find left null children and add into that position
               3. if not empty children found then just move to next level
    */


    private static void insert(TNode root, int data) {
        TNode newNode = new TNode(data);
        Queue<TNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TNode curr = q.poll();
            if (curr.left == null){
                curr.left = newNode;
                return;
            } else if (curr.right == null) {
                curr.right = newNode;
                return;
            }else{
                q.add(curr.left);
                q.add(curr.right);
            }
        }
    }
}
