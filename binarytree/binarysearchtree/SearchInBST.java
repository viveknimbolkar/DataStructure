package binarytree.binarysearchtree;
//https://leetcode.com/problems/search-in-a-binary-search-tree/submissions/
import predefined.TNode;

public class SearchInBST {
    TNode root;

    TNode searchBST(TNode root, int val) {
        while(root != null && root.data != val){
            // if val is less than root node -> go left else right
            root = (val < root.data)?root.left:root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        SearchInBST search = new SearchInBST();
        search.root = new TNode(6);
        search.root.left = new TNode(3);
        search.root.left.left = new TNode(2);
        search.root.left.right = new TNode(4);

        search.root.right = new TNode(8);
        search.root.right.left = new TNode(7);

        search.root.inorder(search.searchBST(search.root,3));
    }
}
