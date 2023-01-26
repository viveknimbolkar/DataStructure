package revision.binarytree.searching;

import predefined.TNode;

import java.util.Stack;

public class InorderWithourRecursion {
    static TNode root;


    public static void main(String[] args) {
        root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.right.left = new TNode(4);
        root.right.right = new TNode(5);
        root.left.left = new TNode(6);
        root.left.right = new TNode(7);

       inorderWithoutRecursion(root);
    }

    private static void inorderWithoutRecursion(TNode root) {
        if (root == null) return;
        Stack<TNode> stack = new Stack<>();
        TNode currNode = root;

        while (currNode != null || !stack.isEmpty()){
            while (currNode != null){
                stack.push(currNode);
                currNode = currNode.left;
            }
            currNode = stack.pop();
            System.out.println(currNode.data);
            currNode = currNode.right;
        }
    }
}
