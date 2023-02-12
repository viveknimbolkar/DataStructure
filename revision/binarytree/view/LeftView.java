package revision.binarytree.view;

import predefined.TNode;

import java.util.ArrayList;

public class LeftView {

    public static void main(String[] args) {
        LeftView leftview = new LeftView();
        TNode root = new TNode(1);
        root.left = new TNode(2);
        root.left.left = new TNode(4);
        root.left.right = new TNode(3);
        root.left.right.left = new TNode(6);
        root.right = new TNode(3);

        System.out.println(leftView(root));

    }

    private static ArrayList<Integer> leftView(TNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        leftUtil(root,0,ans);
        return ans;
    }

    private static void leftUtil(TNode root, int level, ArrayList<Integer> ans) {
        if (root == null) return;
        if (level == ans.size()) ans.add(root.data);
        leftUtil(root.left,level+1,ans);
        leftUtil(root.right,level+1,ans);
    }
}
