package binarytree.binarysearchtree.traversal;

import predefined.TNode;

public class SearchBST {
    static TNode root;

    TNode searchBST(TNode root, int target){
        while (root != null && root.data != target){
            // if target valus is lesses than current node then move left else righ
            if (target < root.data) root = root.left;
            else root = root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        SearchBST bst = new SearchBST();

        root = new TNode(50);
        root.left = new TNode(40);
        root.left.left = new TNode(35);
        root.left.right = new TNode(43);
        root.left.right.left = new TNode(41);
        root.left.right.right = new TNode(49);

        root.right = new TNode(60);
        root.right.right = new TNode(69);
        root.right.left = new TNode(55);

        System.out.println(bst.searchBST(root,43).data);
    }
}
