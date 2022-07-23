package binarytree.binarysearchtree;
//https://leetcode.com/problems/insert-into-a-binary-search-tree/submissions/
import predefined.TNode;

public class InsertIntoBST {
    TNode root;

    TNode insertIntoBST(TNode root, int val) {
        TNode curr = root;

        // start to find the position of the val
        while (true){
            if (curr.data <= val){
                // if val fits at right then add it
                if (curr.right != null) curr = curr.right;
                else {
                    curr.right = new TNode(val);
                    break;
                }
            }else {
                // if val fits at left then add it
                if (curr.left != null) curr = curr.left;
                else {
                    curr.left = new TNode(val);
                    break;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        InsertIntoBST insert = new InsertIntoBST();

        insert.root = new TNode(6);
        insert.root.left = new TNode(3);
        insert.root.left.left = new TNode(2);
        insert.root.left.right = new TNode(4);

        insert.root.right = new TNode(8);
        insert.root.right.left = new TNode(7);

        insert.root.inorder(insert.insertIntoBST(insert.root,5));
    }
}
