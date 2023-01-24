package revision.binarytree.searching;

import predefined.TNode;

import java.util.ArrayList;

public class Preorder {
    static TNode root;

    static void preorder(TNode node, ArrayList<Integer> ans) {
        if (node == null) return;
        ans.add(node.data);
        preorder(node.left, ans);
        preorder(node.right, ans);
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
        preorder(root, ans);

        System.out.println(ans);

    }

}
