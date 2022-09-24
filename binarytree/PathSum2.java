package binarytree;

import predefined.TNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    static TNode root;

    List<List<Integer>> pathSum(TNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>(); // hold the list of paths
        List<Integer>  ds = new ArrayList<>(); // holds the current path
        findPath(root,targetSum,ds,ans);
        return ans;
    }

    void findPath(TNode root, int targetSum,List<Integer>  ds, List<List<Integer>> ans){
        if (root == null) return;
        ds.add(root.data);
        // if we found the targetsum at the end of the leaft
        if (root.left == null && root.right == null && targetSum == root.data){
            ans.add(new ArrayList<>(ds));
        }else {
            // find all the right node path
            findPath(root.left,targetSum-root.data,ds,ans);
            // find all the left node path
            findPath(root.right,targetSum-root.data,ds,ans);
        }
        ds.remove(ds.size()-1);
    }

    public static void main(String[] args) {
        PathSum2 path = new PathSum2();

        root = new TNode(5);
        root.left = new TNode(4);
        root.left.left = new TNode(11);
        root.left.left.left = new TNode(7);
        root.left.left.right = new TNode(2);

        root.right = new TNode(8);
        root.right.right = new TNode(4);
        root.right.right.right = new TNode(1);
        root.right.left = new TNode(13);

        System.out.println(path.pathSum(root,22));
    }
}
