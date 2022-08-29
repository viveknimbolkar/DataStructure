package binarytree;

import predefined.TNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/binary-tree-paths/
public class BinaryTreePaths {
    static TNode root;

    List<String> binaryTreePaths(TNode root) {
        List<String> paths = new ArrayList<>();
        findPaths(root,paths,"");
        return paths;
    }

    void findPaths(TNode node, List<String> paths, String tempAns){
        if (node == null) return;
        tempAns += node.data;

        if (node.left == null && node.right == null){
            paths.add(tempAns);
        }else{
            tempAns = tempAns+"->";
            findPaths(node.left,paths,tempAns);
            findPaths(node.right,paths,tempAns);
        }
    }

    public static void main(String[] args) {
        BinaryTreePaths bitp = new BinaryTreePaths();

        root = new TNode(1);
        root.left = new TNode(2);
        root.left.right = new TNode(5);
        root.right = new TNode(3);

        System.out.println(bitp.binaryTreePaths(root));

    }
}
