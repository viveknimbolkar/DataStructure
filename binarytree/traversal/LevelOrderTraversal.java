package binarytree.traversal;

import predefined.TNode;

public class LevelOrderTraversal {
    TNode root; //calling From BinaryTree class

    LevelOrderTraversal(int data){
        this.root = new TNode(data);
    }

    LevelOrderTraversal(){
        root = null;
    }

    //find the height of the tree using recursive function
    int height(TNode root){
        //if the root nodd is null then do nothing
        if (root == null) // base case
            return 0;
        //recursive function
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        //return the maximum height
        if (leftHeight > rightHeight)
            return( leftHeight+1);//HEIGHT STARTED FROM 1 LEVEL AND NOT FROM ROOT LEVEL
        else
            return (rightHeight+1);//HEIGHT STARTED FROM 1 LEVEL AND NOT FROM ROOT LEVEL
    }

    //print the current level TNodes
    void currentLevelTNodes(TNode root, int level){
        if (root == null)
            return;
//        level are start from 0. the 0th leveCral is root level. We can directly print the root TNode. So we are
//        going to
//        start from 1 level. Use recursive function.
        if (level == 1)
            System.out.println(root.data);
        else if(level > 1){
            currentLevelTNodes(root.left, level - 1);
            currentLevelTNodes(root.right, level - 1);
        }
    }

    //print the all TNodes level by level
    void levelOrderTraversal(){
        int height = height(root);
        for (int i = 1; i <= height; i++) {
            currentLevelTNodes(root, i);
        }
    }

    public static void main(String[] args) {

        LevelOrderTraversal lot = new LevelOrderTraversal();
        lot.root = new TNode(1);
        lot.root.left = new TNode(2);
        lot.root.right = new TNode(3);
        lot.root.left.left = new TNode(4);
        lot.root.left.right = new TNode(5);

        lot.levelOrderTraversal();
    }
}
