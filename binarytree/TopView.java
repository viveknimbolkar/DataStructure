package binarytree;

import predefined.TNode;

import java.util.ArrayList;

public class TopView {

    ArrayList<Integer> topView(Node root){
        ArrayList<Integer> result = new ArrayList<>();

        return result;
    }

    public static void main(String[] args) {
        TopView topView = new TopView();

        TNode node = new TNode();
        node.left = new TNode(1);
        node.left.left = new TNode(2);
        node.left.right = new TNode(5);
        node.right = new TNode(3);
        node.right.left = new TNode(6);
        node.right.right = new TNode(7);

        node.inorder(node);
    }
}
