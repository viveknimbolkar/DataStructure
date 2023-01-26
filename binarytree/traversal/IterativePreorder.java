package binarytree.traversal;

import predefined.TNode;

import java.util.Stack;

public class IterativePreorder {
    static TNode root;

    public static void main(String[] args) {
        root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.right = new TNode(5);
        root.left.left = new TNode(4);
        iterativePreorder(root);
    }

    private static void iterativePreorder(TNode root) {
        if (root == null) return;
        Stack<TNode> stack = new Stack<>();
        TNode curr = root;
        stack.push(curr);
        while (!stack.isEmpty()){
            curr = stack.pop();
            System.out.println(curr.data);
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }

    }
}
