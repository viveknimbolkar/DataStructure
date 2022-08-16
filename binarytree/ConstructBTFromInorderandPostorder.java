package binarytree;

import predefined.TNode;

import java.util.HashMap;

//https://www.youtube.com/watch?v=LgLRTaEMRVc
//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class ConstructBTFromInorderandPostorder {

    TNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> inorderMapping = new HashMap<>();
        // store the mapping of inorder traversal
        for(int i = 0; i < inorder.length; ++i)
            inorderMapping.put(inorder[i],i);

        // costructed tree
        TNode newTree = buildTree(
                inorder,0,inorder.length-1,
                postorder, 0,postorder.length-1,
                inorderMapping);

        return newTree;
    }

    TNode buildTree(
            int[] inorder, int inStart, int inEnd,
            int[] postorder, int postStart, int postEnd,
            HashMap<Integer,Integer> map){

        // base condition
        if (inStart > inEnd || postStart > postEnd) return  null;
        // creating a new node
        TNode root = new TNode(postorder[postEnd]);

        int inRoot = map.get(postorder[postEnd]);
        int leftElement = inRoot - inStart; // node left to the root of the tree

        root.left = buildTree(
                inorder,inStart,inRoot-1,
                postorder,postStart,postStart+leftElement-1,
                map);
        root.right = buildTree(
                inorder,inRoot+1,inEnd,
                postorder,postStart+leftElement,postEnd-1,
                map);

        return root;
    }


    public static void main(String[] args) {
        ConstructBTFromInorderandPostorder construct = new ConstructBTFromInorderandPostorder();

        int[] inorder = {9,3,15,20,7}, postorder = {9,15,7,20,3};
        TNode dummy = new TNode();

        dummy.inorder(construct.buildTree(inorder,postorder));
    }
}
