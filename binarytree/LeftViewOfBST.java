package binarytree;
// TODO:INCOMPLETE
import predefined.TNode;

import java.util.ArrayList;
// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1/

public class LeftViewOfBST {

    TNode root;
    LeftViewOfBST(int data){this.root = new TNode(data);}
    LeftViewOfBST(){}

    ArrayList<Integer> leftView(TNode node){
        return leftViewUtil(node,1);
    }

    ArrayList<Integer> leftViewUtil(TNode node, int level){
        ArrayList<Integer> result = new ArrayList<>();
        int maxLevel = 0;
        if (node == null) return result;
        if (maxLevel < level) {
            result.add(node.data);
            maxLevel = level;
        };
        leftViewUtil(node.left,level+1);
        leftViewUtil(node.right,level+1);
        return result;
    }

    public static void main(String[] args) {
        LeftViewOfBST view = new LeftViewOfBST();
        view.root = new TNode(1);
        view.root.left = new TNode(2);
        view.root.left.left = new TNode(4);
        view.root.left.left.right = new TNode(8);
        view.root.right = new TNode(3);
        view.root.right.right = new TNode(7);
        view.root.right.left = new TNode(6);

        System.out.println(view.leftView(view.root));
    }
}
