package binarytree;

import predefined.TNode;

import java.util.HashMap;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class ConstructBTFromInandPreorder {
    static TNode root;

    // construct tree
    TNode buildTree(int[] preorder, int[] inorder) {
        // store the mapping of inorder array
        HashMap<Integer,Integer> inorderMapping = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            inorderMapping.put(inorder[i], i);

        // build the tree
        TNode newRoot = buildTree(preorder,0, preorder.length -1,inorder,0,inorder.length-1,inorderMapping);
        return newRoot;
    }

    // another helper method to build tree from the given input
    TNode buildTree(int[] preorder, int preStart, int preEnd,
                    int[] inorder, int inStart, int inEnd,
                    HashMap<Integer, Integer> inorderMapping){
        // base condition
        if (preStart > preEnd || inStart > inEnd) return  null;
        // make the first element of preorder array as the root of the new building tree
        TNode newRoot = new TNode(preorder[preStart]);

        // find out the inorder Root in the inorder array
        int inRoot = inorderMapping.get(newRoot.data);
        // find the left elements of the inorder array
        int leftElements = inRoot - inStart;

        // build the left subtree
        newRoot.left = buildTree(
                preorder,preStart+1,preStart+leftElements,
                inorder,inStart,inRoot-1,
                inorderMapping);

        // build the left subtree
        newRoot.right = buildTree(
                preorder,preStart+leftElements+1,preEnd,
                inorder,inRoot+1,inEnd,
                inorderMapping);

        return newRoot;
    }

    public static void main(String[] args) {
        ConstructBTFromInandPreorder construct = new ConstructBTFromInandPreorder();
        int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};

        root.inorder(construct.buildTree(preorder,inorder));
    }
}
