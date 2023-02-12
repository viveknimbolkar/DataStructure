package binarytree.view;

import predefined.TNode;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=KV4mRzTjlAk&list =PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=25
public class LeftView {
    TNode root;

    // reverse level order traversal
    ArrayList<Integer> leftView(TNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        leftUtil(root,0,ans);
        return ans;
    }

    void leftUtil(TNode root, int level,ArrayList<Integer> ans){
        if (root == null) return;
        if (level == ans.size()) ans.add(root.data);
        leftUtil(root.left,level+1,ans);
        leftUtil(root.right,level+1,ans);
    }
    
    public static void main(String[] args) {
        LeftView left = new LeftView();

        left.root = new TNode(1);
        left.root.left = new TNode(2);
        left.root.left.left = new TNode(4);
        left.root.left.right = new TNode(5);
        left.root.left.right.left = new TNode(6);

        left.root.right = new TNode(3);
        left.root.right.right = new TNode(7);

        System.out.println(left.leftView(left.root));
    }
}
