package revision.binarytree.searching;

import predefined.TNode;

import java.util.ArrayList;

public class Inorder {
    static TNode root;

    static void inorder(TNode node, ArrayList<Integer> ans) {
        if (node == null) return;
        inorder(node.left, ans);
        ans.add(node.data);
        inorder(node.right, ans);
    }

    public static void main(String[] args) {
        root = new TNode(21);
        root.left = new TNode(1);
        root.right = new TNode(2);

        root.left.left = new TNode(3);
        root.left.right = new TNode(4);

        root.left.left.left = new TNode(5);
        root.left.left.right = new TNode(4);
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);

        System.out.println(ans);

    }



}
