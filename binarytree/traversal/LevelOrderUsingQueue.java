package binarytree.traversal;

import predefined.TNode;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/level-order-tree-traversal/
public class LevelOrderUsingQueue {
    static TNode root;
    public static void main(String[] args) {
        LevelOrderUsingQueue levelorder = new LevelOrderUsingQueue();
        root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.right = new TNode(4);
        root.left.left = new TNode(5);
        levelOrderUsingQueue(root);
    }

    private static void levelOrderUsingQueue(TNode root) {
        Queue<TNode> q = new LinkedList<>();
        q.add(root);
        // add children of current nodes into queue on every new iteration
        while (!q.isEmpty()){
            TNode curr = q.poll();
            System.out.println(curr.data);
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
    }
}
