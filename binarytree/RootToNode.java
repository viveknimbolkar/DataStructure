package binarytree;

import predefined.TNode;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=fmflMqVOC7k&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=27
public class RootToNode {
    TNode root;
    // mail path function
    // inorder traversal
    ArrayList<Integer> findPath(TNode root,int x){
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        getPath(root,x,ans);
        return ans;
    }
    boolean getPath(TNode root, int x, ArrayList<Integer> ans){
        if (root == null) return false;
        ans.add(root.data);
        if (root.data == x) return true;
        if (getPath(root.left,x,ans) || getPath(root.right,x,ans)) return true;
        ans.remove(ans.size()-1);
        return false;
    }

    public static void main(String[] args) {
        RootToNode path = new RootToNode();

        path.root = new TNode(1);
        path.root.left = new TNode(2);
        path.root.left.left = new TNode(4);
        path.root.left.right = new TNode(5);
        path.root.left.right.left = new TNode(6);
        path.root.left.right.right = new TNode(7);

        path.root.right = new TNode(3);

        System.out.println(path.findPath(path.root,7));

    }
}
