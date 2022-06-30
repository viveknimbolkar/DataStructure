package binarytree.view;

import predefined.TNode;
// https://leetcode.com/problems/binary-tree-right-side-view/submissions/
import java.util.ArrayList;

public class RightView {
    TNode root;
    // reverse level order traversal
    ArrayList<Integer> rightView(TNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        rightUtil(root,0,ans);
        return ans;
    }

    // get the first node of each level
    void rightUtil(TNode root, int level,ArrayList<Integer> ans){
        if (root == null) return;
        if (level == ans.size()) ans.add(root.data);
        rightUtil(root.right,level+1,ans);
        rightUtil(root.left,level+1,ans);
    }

    public static void main(String[] args) {
        RightView left = new RightView();

        left.root = new TNode(1);
        left.root.left = new TNode(2);
        left.root.left.left = new TNode(4);
        left.root.left.right = new TNode(5);
        left.root.left.right.left = new TNode(6);

        left.root.right = new TNode(3);
        left.root.right.right = new TNode(7);

        System.out.println(left.rightView(left.root));
    }
}
