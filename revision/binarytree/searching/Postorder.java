package revision.binarytree.searching;

import predefined.TNode;

import java.util.ArrayList;

public class Postorder {
    static TNode root;

    static void postorder(TNode node, ArrayList<Integer> ans) {
        if (node == null) return;
        postorder(node.left, ans);
        postorder(node.right, ans);
        ans.add(node.data);
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
        postorder(root, ans);

        System.out.println(ans);

    }

}
