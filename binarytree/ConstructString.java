package binarytree;

import predefined.TNode;

//https://leetcode.com/problems/construct-string-from-binary-tree/
public class ConstructString {
    static TNode root;
    StringBuilder constructedString;

    String tree2str(TNode root) {
        constructedString = new StringBuilder();
        build(root);
        return constructedString.toString();
    }

    void build(TNode node){
        if (node == null) return;
        if (node.left == null && node.right == null){
            constructedString.append(node.data);
            return;
        }
        constructedString.append(node.data);
        constructedString.append("(");
        build(node.left);
        constructedString.append(")");

        if (node.right != null){
            constructedString.append("(");
            build(node.right);
            constructedString.append(")");
        }
        return;
    }

    public static void main(String[] args) {
        ConstructString construct = new ConstructString();

        root = new TNode(1);
        root.left = new TNode(2);
        root.right = new TNode(3);
        root.left.left = new TNode(4);;

        System.out.println("Constructed String: "+construct.tree2str(root));
    }
}
