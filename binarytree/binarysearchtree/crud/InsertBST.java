package binarytree.binarysearchtree.crud;

import predefined.TNode;

//https://www.youtube.com/watch?v=FiFiNvM29ps&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=44
public class InsertBST {
    static TNode root;

    TNode insertNode(TNode root,int val){
        TNode curr = root;
        if (root == null) return new TNode(val);
        while (true){
            //every time check for the low and high val of root
            if (curr.data <= val){
                // move to the right until we reach to the perfect position
                if (curr.right != null ) curr = curr.right;
                else {
                    // reach to the end or correct position
                    curr.right = new TNode(val);
                    break;
                }
            }else {
                // if val is greater than current node move left
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
        InsertBST insert = new InsertBST();
        root = new TNode(8);
        root.left = new TNode(4);
        root.left.left = new TNode(2);
        root.left.right = new TNode(6);
        root.right = new TNode(12);
        root.right = new TNode(14);
        root.right.left = new TNode(10);

        root.inorder(insert.insertNode(root,33));
    }
}
