package binarytree.traversal;

import predefined.TNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.youtube.com/watch?v=2YBhNLodD8Q&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=13
public class IterativePostorder {
    TNode root; // root node of the tree

    // Method-1: Using two stack
    List<Integer> iterativePostorder(TNode root){
        List<Integer> postorder = new ArrayList<>();
        Stack<TNode> st1 = new Stack<>();
        Stack<TNode> st2 = new Stack<>();

        // if tree is empty
        if (root==null) return postorder;

        // take all the postorder element (first right child then left child)
        st1.push(root);
        while (!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            if (root.left != null) st1.push(root.left);
            if (root.right != null) st1.push(root.right);
        }

        // add all the element of st2 into postorder (final answer)
        while (!st2.isEmpty())
            postorder.add(st2.pop().data);
        return postorder;
    }

    // Method-2: Using single stack (psude code available)
    // https://www.youtube.com/watch?v=ySp2epYvgTE&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=14

    public static void main(String[] args) {
        IterativePostorder itr = new IterativePostorder();
        itr.root = new TNode(1);
        itr.root.left = new TNode(2);
        itr.root.left.left = new TNode(4);
        itr.root.left.right = new TNode(5);
        itr.root.right = new TNode(3);
        itr.root.right.left = new TNode(6);
        itr.root.right.left.right = new TNode(7);
        itr.root.right.left.right.right = new TNode(8);

        for (Integer i: itr.iterativePostorder(itr.root)) {
            System.out.print(i+" ");
        }
    }
}
