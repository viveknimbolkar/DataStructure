package binarytree;

import predefined.TNode;

import java.util.Stack;

//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
public class FindCorrespondingNode {
    TNode root, root2;

    // find the target node in root2 binary tree
    TNode getTargetCopy(TNode original, TNode cloned,TNode target) {
       return util(cloned,target);
    }

    TNode util(TNode cloned,TNode target){
        if (cloned == null) return null;
        // every time check for target node
        if (cloned.data == target.data) return cloned;

        // go to the leftmost node
        TNode left = util(cloned.left,target);
        // then go to the leftmost node
        TNode right = util(cloned.right,target);

        // if left is not null then return left node else right
        if (left != null) return left;
        else return right;
    }


    public static void main(String[] args) {
        FindCorrespondingNode find = new FindCorrespondingNode();

        find.root = new TNode(7);
        find.root.left = new TNode(4);
        find.root.right = new TNode(3);
        find.root.right.left = new TNode(6);
        find.root.right.right = new TNode(19);

        find.root2 = new TNode(7);
        find.root2.left = new TNode(4);
        find.root2.right = new TNode(3);
        find.root2.right.left = new TNode(6);
        find.root2.right.right = new TNode(19);

        System.out.println("Found: "+find.getTargetCopy(find.root,find.root2,find.root2.right).data);
    }
}
